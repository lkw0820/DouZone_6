package org.zerock.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;
import org.zerock.domain.Ticket;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample/*")
@Log4j
public class SampleController {
	
	@GetMapping("/getSample")
	public SampleVO getSample() {
		return new SampleVO(100,"이","기원");
	}
	@GetMapping("/getList")
	public List<SampleVO> getList(){
		return IntStream.range(1, 10).mapToObj(i->new SampleVO(i,i+"First",i+"Last"))
				.collect(Collectors.toList());
	}
	@PostMapping("/ticket")
	public Ticket convert(@RequestBody Ticket tik) {
		log.info("convert....."+tik);
		return tik;
	}
}
