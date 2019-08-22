package com.fahim;
import java.util.*;
import java.util.stream.Collectors;
public class NewsMain {

	public static void main(String[] args) {
		List<News> news=Arrays.asList(
				new News(1,"Jack","John","Hi Jack good work done!"),
				new News(2,"Jim","Jenny","Hi Jack good work done!"),
				new News(3,"Joel","Mike","Joel great budget done!"),
				new News(1,"Jack","Tom","Hi Jack good work done!"),
				new News(3,"Joel","John","Hi Jack good work done!"),
				new News(1,"Jack","John","Great budget summary!!")
				);
		Integer newsId = news.stream()
		.collect(Collectors.groupingBy(News::getNewsId,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey(); 
		System.out.println("Item with maximum comments:"+newsId);
		
		Long wordCount = news.stream().filter(news1 -> news1.getComment().contains("budget")).count();
		System.out.println("Number of word occurence:"+wordCount);
		
		Map<String,Long> commentByUser = news.stream()
		.collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting())); 
		System.out.println("Comments brief by User:"+commentByUser);
	}

}
