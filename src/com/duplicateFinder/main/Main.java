package com.duplicateFinder.main;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.TagField;

public class Main {
	
public static void main(String[] args) throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Path to scan");
	String dirPath = sc.next();
	File dir = new File(dirPath);
	for(File f: dir.listFiles()){
		System.out.println("*****************************************************");
		Tag tag = AudioFileReader.getTagsForSong(f);
		System.out.println(tag.getFirst(FieldKey.ARTIST));
		System.out.println(tag.getFirst(FieldKey.ALBUM));
		System.out.println(tag.getFirst(FieldKey.TITLE));
		System.out.println(tag.getFirst(FieldKey.COMMENT));
		System.out.println(tag.getFirst(FieldKey.YEAR));
		System.out.println(tag.getFirst(FieldKey.TRACK));
		System.out.println(tag.getFirst(FieldKey.DISC_NO));
		System.out.println(tag.getFirst(FieldKey.COMPOSER));
		System.out.println(tag.getFirst(FieldKey.ARTIST_SORT));
	}
}
}
