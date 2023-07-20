package org.zerock.domain;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class Criteria {
  //페이지 번호
  private int pageNum;
  //페이지당 보여줄 개수
  private int amount;
  
  private String type;
  private String keyword;

  public Criteria() {
    this(1, 10);
  }

  public Criteria(int pageNum, int amount) {
    this.pageNum = pageNum;
    this.amount = amount;
  }
  //검색용
  public String[] getTypeArr() {
    
    return type == null? new String[] {}: type.split("");
  }
  public String getListLink() {
	  UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
			  .queryParam("pageNum", this.pageNum)
			  .queryParam("amount", this.amount)
			  .queryParam("type", this.type)
			  .queryParam("keyword", this.keyword);

	
	return builder.toUriString();
  }
}
