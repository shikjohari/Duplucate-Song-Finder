package com.duplicateFinder.main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.audio.mp3.MP3FileReader;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.id3.ID3v1Tag;

public class Main{
	static MP3FileReader mp3Reader = new MP3FileReader();
	public static void main(String[] args) throws IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		File file = new File(path);int i = 0;
		for(File f: file.listFiles()){
			if(f.getAbsolutePath().endsWith(".mp3")){i++;
				System.out.println("****************************************************");
			MP3File mp3 = (MP3File) mp3Reader.read(f);
			System.out.println("Reading File "+ f.getAbsolutePath());
			if(mp3.hasID3v1Tag()){
				System.out.println("File has ID3v1 Tag");
				extractID3v1Tags(mp3.getID3v1Tag());
			}else{System.out.println( "File does not have any ID3V1 tag");}
			if(mp3.hasID3v2Tag()){
				System.out.println("File has ID3v2 Tag");
				System.out.println(mp3.getID3v2Tag());
			}else{System.out.println("File does not have any ID3V2 tag");}
		}
	}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ Count is "+ i);
	}
	private static  void extractID3v1Tags(ID3v1Tag id3v1Tag) {
		System.out.println( "**Album : " +id3v1Tag.getFirstAlbum());
System.out.println( "**Title : " +id3v1Tag.getTitle());
System.out.println( "**Artist : " +id3v1Tag.getArtist());
	}
}