<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<script src="/jcinema/admin/js/movieSearch.js"></script>
<div>
    <div class="container">
        <%@ include file="../_aside.jsp" %>
        <section id="sub" class="movie-schedule">

            <div id="searchBg">

                <div class="content">
                    <h2>영화검색</h2>
                    <button class="btnClose">닫기</button>
                    
                    <div>
                        <input type="text" name="title">
                        <button class="btnSearch">검색</button>
                        <table class="searchTable"></table>
                    </div>

                </div>
            </div>

            <nav>
                <h3>영화상영 일정 등록</h3>
                <p>영화관리 > 영화상영 일정 등록</p>
            </nav>
                                
            <article>
                <form action="/jcinema/admin/movie/schedule" method="post">                	
        			<input type="hidden" name="schedule_movie_no" value="0" />
        	
                    <div class="field">
                        <label for="theater_city">영화관</label>
                        <select name="theater_city" id="theater_city">
                            <option>지역선택</option>
                            <option>서울</option>
                            <option>경기/인천</option>
                            <option>충청/대전</option>
                            <option>전라/광주</option>
                            <option>경북/대구</option>
                            <option>경남/부산/울산</option>
                            <option>강원</option>
                            <option>제주</option>
                        </select>
                        <select name="schedule_theater_no" id="theater_name">
                            <option>영화관 선택</option>
                            <option value="103">광복</option>
                        </select>
                    </div>

                    <div class="field">
                        <label for="screen_no">상영관</label>
                        <select name="schedule_screen_no" id="screen_no">
                            <option>상영관 선택</option>
                            <option value="1">1관</option>
                            <option value="2">2관</option>                            
                            <option value="3">3관</option>
                        </select>
                    </div>
                    <div class="field">
                        <label for="schedule_movie_title">상영영화</label>
                        <input id="schedule_movie_title" type="text" name="schedule_movie_title" readonly />
                        <button class="btnMovieSearch">검색</button>
                    </div>
                    <div class="field">
                        <label for="schedule_date">상영일</label>
                        <input id="schedule_date" type="date" name="schedule_date" />
                    </div>
                    <div class="field">
                        <label for="schedule_round_view">상영회차</label>
                        <select name="schedule_round_view" id="schedule_round_view">
                            <option>상영회차 선택</option>
                            <option value="1">1회차</option>
                            <option value="2">2회차</option>
                            <option value="3">3회차</option>
                            <option value="4">4회차</option>
                            <option value="5">5회차</option>
                            <option value="6">6회차</option>
                            <option value="7">7회차</option>
                        </select>
                    </div>
                    <div class="field">
                        <label for="schedule_start_time">상영 시작시간</label>
                        <input id="schedule_start_time" type="datetime" name="schedule_start_time" />
                        <span>24시간 형식 입력 예) 10:00, 13:00, 17:00, 23:00, 01:00</span>
                    </div>
                    <div class="field">
                        <label for="schedule_end_time">상영 종료시간</label>
                        <input id="schedule_end_time" type="datetime" name="schedule_end_time" />
                        <span>24시간 형식 입력 예) 10:00, 13:00, 17:00, 23:00, 01:00</span>
                    </div>
                    
                    <button type="submit" class="btnRegister">등록하기</button>
                </form>
            </article>

            <p class="ico info">
                <strong>Tip!</strong>
                영화상영 일정을 등록해야 티켓을 생성할 수 있습니다.
            </p>

            

        </section>
    </div>
</div>
<%@ include file="../_footer.jsp" %>