package com.raihan.radio;

public class Interface {
	public String radioName(String id){
		if(id.equals("1")){
			return "Radio Foorti :";
		}
		if(id.equals("2")){
			return "Friends Fm :";
		}
		if(id.equals("3")){
			return "Radio Today Fm :";
		}
		return "";
	}
	
	public String radioPic(String id){
		if(id.equals("1")){
			return "pics/foortiFM.jpg";
		}
		if(id.equals("2")){
			return "pics/friendsFM.png";
		}
		if(id.equals("3")){
			return "pics/todayFM.jpg";
		}
		return "";
	}
	
	public String radioStream(String id){
		String idm_id = "";
		String src = "";
		
		if(id.equals("1")){
			idm_id = "82004993";
			src = "http://119.148.23.88:1021/;stream/1";
		}
		if(id.equals("2")){
			idm_id = "82004993";
			src = "http://188.166.176.244:8919/";
		}
		if(id.equals("3")){
			idm_id = "867821569";
			src = "http://stream.zenolive.com/8wv4d8g4344tv";
		}
		return "<video controls='false' autoplay='true' name='media' width='303' height='40' __idm_id__='" 
				+ idm_id 
				+ "'><source src='"
				+ src  
				+ "' type='audio/mpeg'></video>";
	}
}
