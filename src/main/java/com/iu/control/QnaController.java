package com.iu.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.qna.QnaDTO;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {
	@RequestMapping(value="qnaWrite", method={RequestMethod.GET})
	public void write() {
		
	}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public String write(QnaDTO qnaDTO, String title) {
		System.out.println(qnaDTO.getTitle());
		System.out.println("title : " + title);
		System.out.println(qnaDTO.getWriter());
		System.out.println(qnaDTO.getAge());
		
		for(String s : qnaDTO.getName()) {
			System.out.println(s);
		}
		/*
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		*/
		return "redirect:./qnaList?curPage=5";
	}
	
	@RequestMapping(value="qnaView")
	public String view(Model model) { 
		// model = 서버쪽으로 보내는 전달 객체
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("하하ㅏㅎ");
		qnaDTO.setAge(26);
		// model.addAttribute(qnaDTO);
		model.addAttribute("view", qnaDTO);
		model.addAttribute("board", "Q&A");
		return "qna/qnaView"; 
	}
	
	@RequestMapping(value="qnaList")
	public ModelAndView list(ModelAndView mv, @RequestParam(defaultValue="0", required=false) int curPage) {
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("test");
		qnaDTO.setAge(23);
		mv.addObject("view", qnaDTO);
		mv.setViewName("qna/qnaList");
		System.out.println(curPage);
		
		return mv;
	}
}
