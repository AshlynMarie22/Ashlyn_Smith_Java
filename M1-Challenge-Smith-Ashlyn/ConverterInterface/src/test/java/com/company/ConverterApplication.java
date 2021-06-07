package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterApplication {
 ConverterIf converterIf;
 ConverterSwitch converterSwitch;

 @Before
 public void setUp(){
  converterIf = new ConverterIf();
  converterSwitch = new ConverterSwitch();
 }

 @Test
public void usingIfConvertNumToMonth() {
  assertEquals("January", converterIf.convertMonth(1));
  assertEquals("October", converterIf.convertMonth(10));
  assertEquals("July", converterIf.convertMonth(7));
 }

 @Test
 public void usingIfConvertNumToDay() {
  assertEquals("Monday", converterIf.convertDay(1));
  assertEquals("Sunday", converterIf.convertDay(7));
  assertEquals("Thursday", converterIf.convertDay(4));
 }

 @Test
 public void usingSwitchConvertNumToMonth() {
  assertEquals("January", converterSwitch.convertMonth(1));
  assertEquals("December", converterSwitch.convertMonth(12));
  assertEquals("April", converterSwitch.convertMonth(4));
 }

 @Test
 public void usingSwitchConvertNumToDay() {
  assertEquals("Monday", converterSwitch.convertDay(1));
  assertEquals("Saturday", converterSwitch.convertDay(6));
  assertEquals("Tuesday", converterSwitch.convertDay(2));
 }


}
