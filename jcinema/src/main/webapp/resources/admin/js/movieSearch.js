$(function(){
		
	// 영화검색 팝업창 
	var searchBg = $('#searchBg');
	var btnClose = $('#searchBg .btnClose');
	var btnMovieSearch = $('.movie-schedule .btnMovieSearch');
	
	btnMovieSearch.click(function(e){
		e.preventDefault();
		searchBg.show();
	});
	
	btnClose.click(function(e){
		e.preventDefault();
		searchBg.hide();
	});
	
	
	// 영화검색
	var btnSearch   = $('#searchBg .btnSearch');
	var searchTable = $('#searchBg .searchTable');
	
	btnSearch.click(function(){
		
		
		var movieTitle = $('#searchBg input[name=title]').val();
		var url = "/jcinema/api/movies?title="+movieTitle;
		
		$.get(url, function(data){
			
			// 리턴된 JSON문자열을 오브젝트 객체로 변환 
			var data = JSON.parse(data);
			
			searchTable.empty();
			
			for(var i=0 ; i<data.length ; i++){
				
				
				searchTable.append( '<tr>'+
                        			'<th>'+data[i].movie_no+'</th>'+
                        			'<td>'+data[i].movie_title+'</td>'+
                        			'<td>'+data[i].movie_genre+'</td>'+
                        			'<td>'+data[i].movie_grade+'</td>'+
                        			'<td>'+data[i].movie_release_date.substring(2, 10)+'</td>'+
                        			'<td><button class="btnChoice" data-movie-no="'+data[i].movie_no+'" title="'+data[i].movie_title+'">선택</button></td>'+
                        			'</tr>');
				
			}
			
			
		});
	}); // btnSearch end
	
	// btnChoice에 대한 동적이벤트 구현
	$(document).on('click', '.btnChoice', function(){
		
		var title   = $(this).attr('title');
		var movieNo = $(this).attr('data-movie-no');
		
		$('#schedule_movie_title').val(title);
		$('input[name=schedule_movie_no]').val(movieNo);
		
		searchBg.hide();
	});
	
});