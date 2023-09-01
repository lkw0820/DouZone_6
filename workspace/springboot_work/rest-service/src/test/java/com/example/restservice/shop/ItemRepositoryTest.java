package com.example.restservice.shop;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;

    @PersistenceContext
    EntityManager em;

    public void createItemList(){
        for(int i=1;i<=10;i++){
            Item item = new Item();
            item.setItemNm("테스트 상품" + i);
            item.setPrice(10000 + i);
            item.setItemDetail("테스트 상품 상세 설명" + i);
            item.setStockNumber(100); item.setRegTime(LocalDateTime.now());
            item.setUpdateTime(LocalDateTime.now());
            Item savedItem = itemRepository.save(item);
        }
    }
//    @Test
//    //@DisplayName("상품 저장 테스트")
//    public  void createItemTest(){
//        Item item = new Item();
//        item.setItemNm("테스트 상품");
//        item.setPrice(10000);
//        item.setItemDetail("테스트 상품 상세 설명");
//        item.setStockNumber(100);
//        item.setRegTime(LocalDateTime.now());
//        item.setUpdateTime(LocalDateTime.now());
//        Item savedItem = itemRepository.save(item);
//        System.out.println(savedItem.toString());
//    }

//    @Test
//    //@DisplayName("상품명 조회 테스트")
//    public void findByItemNmTest(){
//        this.createItemList();
//        List<Item> itemList = itemRepository.findByItemNm("테스트 상품1");
//        for(Item item : itemList){
//            System.out.println(item.toString());
//        }
//    }
//    @Test
//    //@DisplayName("Querydsl 조회 테스트1")
//    public void queryDslTest() {
//        this.createItemList();
//        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
//        QItem qItem = QItem.item;
//        JPAQuery<Item> query = queryFactory.selectFrom(qItem)
//                .where(qItem.itemDetail.like("%" + "설명10" + "%"))
//                .orderBy(qItem.price.desc());
//
//        List<Item> itemList = query.fetch();
//
//        for (Item item : itemList) {
//            System.out.println(item.toString());
//        }
//    }
    @Test
    public void findByItemDetailTest(){
        this.createItemList();
        List<Item> itemList = itemRepository.findByItemDetail("테스트 상품 상세 설명6");
        for(Item item:itemList){
            System.out.println(item.toString());

        }
    }
}