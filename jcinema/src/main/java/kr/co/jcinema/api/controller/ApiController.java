package kr.co.jcinema.api.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import kr.co.jcinema.admin.vo.AdminMovieScheduleVo;
import kr.co.jcinema.admin.vo.AdminMovieVo;
import kr.co.jcinema.api.service.ApiService;
import kr.co.jcinema.api.vo.ApiTheaterVo;

@Controller
public class ApiController {
	@Inject
	private ApiService service;
	
	@GetMapping(value="/api/theaters", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getTheaters() {
		
		Map<String, List<ApiTheaterVo>> theaters = service.selectTheaters();
		return new Gson().toJson(theaters);
	}
	
	@GetMapping(value="/api/movies", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovieTitles(String title) {
		
		List<AdminMovieVo> movies = service.selectMovies(title);	
		
		return new Gson().toJson(movies);
	}
	@GetMapping(value="/api/movie-schedule", produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getMovieSchedule(AdminMovieScheduleVo vo) {
		AdminMovieScheduleVo movieSchedule = service.selectMovieSchedule(vo);
		return new Gson().toJson(movieSchedule);
	}
	
	
}
