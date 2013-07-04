/*
    Copyright 2005, 2005 Burcu Yildiz
    Contact: burcu.yildiz@gmail.com
    
    This file is part of pdf2table.
*/

package pdf2xml;

import java.util.*;

public class Multiline_Block {
	
int begin;
int end;

int leftmost;
int rightmost;
int max_elements;
int avg_distance;
int page;
int used_space = 0;

  public Multiline_Block() {
  
  }
  
  public Multiline_Block(int b, int e, int l,int r,int me,int ad,int p) {
  	this.begin = b;
  	this.end = e;
  	this.leftmost = l;
  	this.rightmost = r;
  	this.max_elements = me;
  	this.avg_distance = ad;
  	this.page = p;
  }	
}