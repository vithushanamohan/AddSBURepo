package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.aventstack.extentreports.Status;

import Base.DriverInitialization;
import pages.Addsbu;

public class AddsbuTest extends DriverInitialization{
	Addsbu adsbu=new Addsbu();
	
	//click Master
	public void Login() throws InterruptedException {

		PageFactory.initElements(driver, adsbu);
		Addsbu.Username.sendKeys("admin");
		Addsbu.Password.sendKeys("tokyo@admin");
		Addsbu.LoginButton.click();
		
		Thread.sleep(4000);
		Addsbu.master.click();
		
		Thread.sleep(3000);
		Addsbu.sbutable.click();
	}
	
//AddSbuButtonUI
	public void AddsbuButton() throws InterruptedException {
		PageFactory.initElements(driver, adsbu);
		 
		try {
			boolean ExpectedTextVisible=true;
			System.out.println("IsVisible");
			boolean ActualTextVisible=Addsbu.AddSBUbutton.isDisplayed();
			testCase = extent.createTest("1-ADD-SBU-VISIBLE");
			try {
				Assert.assertEquals(ActualTextVisible, ExpectedTextVisible);
				testCase.log(Status.INFO, "Actual Visible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
				testCase.log(Status.PASS, " Correct");
			} catch (AssertionError e) {
				testCase.log(Status.INFO, "ActualVisible :- " + ActualTextVisible);
				testCase.log(Status.INFO, "Expected Visible :- " + ExpectedTextVisible);
				testCase.log(Status.FAIL, "Wrong");
			}
		}
		catch(Exception e) {
			testCase = extent.createTest("1-ADD-SBU-VISIBLE");
			testCase.log(Status.FAIL, "No element");
		}
		
		//Add SBU Button FONT COLOR

				try {	
					String ActualTitleFontColor = Addsbu.AddSBUbutton.getCssValue("color");
					System.out.println("Font color of button: " + ActualTitleFontColor);
					String ExpectedTitleFontColor ="rgba(255, 255, 255, 1)";
					testCase = extent.createTest("2.ADD-SBU-FONT-COLOUR");
					
					try {
					  AssertJUnit.assertEquals(ActualTitleFontColor, ExpectedTitleFontColor);
					  testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
					  testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
					  testCase.log(Status.INFO, "Correct font Colour");
					  testCase.log(Status.PASS, "Correct font Colour");
					
					} catch(AssertionError e){
					  testCase.log(Status.INFO, "ActualColour :- " + ActualTitleFontColor);
					  testCase.log(Status.INFO, "ExpectedColour :- " + ExpectedTitleFontColor);
					  testCase.log(Status.INFO, "wrong font Colour");
					  testCase.log(Status.FAIL, "wrong font Colour");
					}
				}
				catch(Exception e) {
					testCase = extent.createTest("2.ADD SBU-FONT-COLOUR");
					testCase.log(Status.FAIL, "No element");
				}
				
				//Add SBU Button FONTSIZE

				
				try {
							String ActualTitleFontsSize = Addsbu.AddSBUbutton.getCssValue("font-size");
							System.out.println("Font Size: " + ActualTitleFontsSize);
							String ExpectedTitleFontsSize = "14px";
							testCase = extent.createTest("3.ADD SBU-FONT- SIZE");
						try{
						  AssertJUnit.assertEquals(ActualTitleFontsSize, ExpectedTitleFontsSize);
						  testCase.log(Status.INFO, "ActualfontSize :-" + ActualTitleFontsSize);
						  testCase.log(Status.INFO, "ExpectedfontSize:-" + ExpectedTitleFontsSize);
						  testCase.log(Status.PASS, "Correct font-size");
						  testCase.log(Status.PASS, " Font-size Correct");
						}catch(AssertionError e) {
						  testCase.log(Status.INFO, "ActualfontsSize :- " + ActualTitleFontsSize);
						  testCase.log(Status.INFO, "ExpectedfontsSize :- " + ExpectedTitleFontsSize);
						  testCase.log(Status.INFO, "Wrong font-size");
						  testCase.log(Status.FAIL, "Font-size Wrong");
						
						}
					}
					catch(Exception e) {
						testCase = extent.createTest("3.ADD SBU FONT- SIZE");
						testCase.log(Status.FAIL, "No Element");
					}
				//Add SBU Button Font Family 


				try {
					String ActualElementfamily = Addsbu.AddSBUbutton.getCssValue("font-family");
					System.out.println("FONT-FAMILY: "+ActualElementfamily);
					String ExpectedElementFamily = "Roboto, sans-serif";
					testCase = extent.createTest("4.ADD-SBU-FONT-FAMILY");
				try {
					  Assert.assertEquals(ActualElementfamily, ExpectedElementFamily);
					  testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
					  testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
					  testCase.log(Status.PASS, "Correct Text");
				} catch (AssertionError e) {
					  testCase.log(Status.INFO, "ActualText :- " + ActualElementfamily);
					  testCase.log(Status.INFO, "ExpectedText :- " + ExpectedElementFamily);
					  testCase.log(Status.FAIL, "wrong Text");
				}
				}
				catch(Exception e) {
					testCase = extent.createTest("4.FONT-FAMILY");
					 testCase.log(Status.FAIL, "NO ELEMENT");
				}

				//Add SBU Button Spelling	

					try {
							  String AcctualTitleText = Addsbu.AddSBUbutton.getText();
							  String ExpectedTitleText = "Add SBU";
							  System.out.println(" Text:" + AcctualTitleText);
							  testCase = extent.createTest("5.ADD-SBU-SPELLING-TEXT");
						  try {
						
						      testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
						      testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
						
						      testCase.log(Status.PASS, "Correct element");
						  } catch(AssertionError e) {
						      testCase.log(Status.INFO, "AcctualText :- " + AcctualTitleText);
						      testCase.log(Status.INFO, "ExpectedText :- " + ExpectedTitleText);
						 
						      testCase.log(Status.FAIL, "Wrong Element");
						  }
						} catch (Exception find9) {
							  testCase = extent.createTest("5.ADD-SBU-SPELLING-TEXT");
							  testCase.log(Status.FAIL, "No Element");
						}
					
					//Add SBU Button Position

					try {
							Point ActulalLocation = Addsbu.AddSBUbutton.getLocation();        
							int actual_x = ActulalLocation.getX();
							int actual_y = ActulalLocation.getY();
							System.out.println("X axis: " + actual_x);
							System.out.println("Y axis: " + actual_y);
							Point ExpectedLocation = new Point(588, 93);
						
						testCase = extent.createTest("6.ADD-SBU-BUTTON-POSITION");
						try {
							  AssertJUnit.assertEquals(ActulalLocation, ExpectedLocation);
							  testCase.log(Status.INFO, "ActualFontSize :- " + ActulalLocation);
							  testCase.log(Status.INFO, "ExpectedFontSize :- " + ExpectedLocation);
							  testCase.log(Status.PASS, "Correct Location");
						} catch(AssertionError e){
							  testCase.log(Status.INFO, "ActualSize :- " + ActulalLocation);
							  testCase.log(Status.INFO, "ExpectedSize :- " + ExpectedLocation);
							  testCase.log(Status.FAIL, "Wrong Location");
						}
					 }
					catch(Exception e) {
						 testCase = extent.createTest("6.ADD-SBU-POSITION");
						 testCase.log(Status.FAIL, "NO ELEMENT");
						
					} 
				 
				
			//Add SBU Button Padding 

					try { 
								String Actualpadding = Addsbu.AddSBUbutton.getCssValue("padding");
								System.out.println("PADDING: "+Actualpadding);
								String Expectedpadding = "4px 15px";
								testCase = extent.createTest("7.ADD-SBU-TEXT PADDING");
							try {
								  Assert.assertEquals(Actualpadding, Expectedpadding);
								  testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
								  testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
								  testCase.log(Status.PASS, "padding is Correct");
							} catch (AssertionError e) {
								  testCase.log(Status.INFO, "Actual padding :- " + Actualpadding);
								  testCase.log(Status.INFO, "Expected padding :- " + Expectedpadding);
								  testCase.log(Status.FAIL, "padding is Wrong");
							}
						}
					catch(Exception e) {
						 testCase = extent.createTest("7.ADD-SBU-PADDING");
						 testCase.log(Status.FAIL, "NO ELEMENT");
					}	 


				
			//Add SBU Button Shadow


			try {
					String Actualshadow = Addsbu.AddSBUbutton.getCssValue("box-shadow");
					System.out.println("Text Shadow :" + Actualshadow);
					String ExpectedShadow = "rgba(0, 0, 0, 0.016) 0px 2px 0px 0px";
					testCase = extent.createTest("8.ADD-SBU-BOX-SHADOW");
					try {
					  AssertJUnit.assertEquals(Actualshadow, ExpectedShadow);
					  testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
					  testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
					  testCase.log(Status.PASS, "Shadow available");
					} catch(AssertionError e){
					  testCase.log(Status.INFO, "ActualShadow :- " + Actualshadow);
					  testCase.log(Status.INFO, "ExpectedShadow :- " + ExpectedShadow);
					  testCase.log(Status.FAIL, "Shadow not available");
					}
				}
					catch(Exception find6) {
						testCase = extent.createTest("8.ADD-SBU-BOX-SHADOW");
						testCase.log(Status.FAIL, "No Element");
					}


			//Add SBU Button BACKGROUND COLOR


			try {
					String Actualbackground = Addsbu.AddSBUbutton.getCssValue("color");
					System.out.println("BACKGROUND COLOR:" + Actualbackground);
					String Expectedbackground= "rgba(255, 255, 255, 1)";
					

					testCase = extent.createTest("9.ADD-SBU-BACKGROUND COLOR");
					try {
						AssertJUnit.assertEquals(Actualbackground, Expectedbackground);
						
						testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
						testCase.log(Status.INFO, "Expectedbackgroundcolor :- " + Expectedbackground);
						testCase.log(Status.PASS, "correct");
					} catch(AssertionError e) {
						testCase.log(Status.INFO, "Actualbackgroundcolor :- " + Actualbackground);
						testCase.log(Status.INFO, "Expectedbackgroundcolor:- " + Expectedbackground);
						testCase.log(Status.FAIL, "wrong");
					}
				}
					catch(Exception e) {
						testCase.log(Status.FAIL, "No Element");
						testCase = extent.createTest("9.ADD-SBU-BACKGROUND COLOR");
					}
				

			//Add SBU Button BORDER COLOR
			 
			 

					try {		 
							String actualbordercolor = Addsbu.AddSBUbutton.getCssValue("border-color");
							System.out.println(" border-color:" + actualbordercolor);
							String Expectedbordercolor = "rgb(255, 255, 255)";
							testCase = extent.createTest("10.ADD-SBU-BORDER-COLOR");
							try {
								AssertJUnit.assertEquals(actualbordercolor, Expectedbordercolor);
								testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
								testCase.log(Status.INFO, "Expectedbordercolor :- " + Expectedbordercolor);
								testCase.log(Status.PASS, "correct");
							} catch(AssertionError e) {
								// TODO: handle exception
							} {
								testCase.log(Status.INFO, "Actualbordercolor :- " + actualbordercolor);
								testCase.log(Status.INFO, "Expectedbordercolor :- " +Expectedbordercolor);
								testCase.log(Status.FAIL, "wrong");
							}
						}
						catch(Exception e) {
								testCase.log(Status.FAIL, "NO ELEMENT");
								testCase = extent.createTest("10.ADD-SBU-BORDER-COLOR");
							}
				 
				 
			//Add SBU Button CURSER POINT	 

					try {	 
							String ActualCursor = Addsbu.AddSBUbutton.getCssValue("cursor");
							System.out.println("cursor :" + ActualCursor);
							String Expectedcursor = "pointer";
							testCase = extent.createTest("11.ADD-SBU-CURSOR");
							try {
								AssertJUnit.assertEquals(ActualCursor, Expectedcursor);
								testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
								testCase.log(Status.INFO, "ActualCursor:- " + Expectedcursor);
								testCase.log(Status.PASS, "correct");
							}  catch(AssertionError e) {
								testCase.log(Status.INFO, "ActualCursor :- " + ActualCursor);
								testCase.log(Status.INFO, "ActualCursor :- " + Expectedcursor);
								testCase.log(Status.FAIL, "wrong");
							}
						}
							catch(Exception e) {
								testCase.log(Status.FAIL, "No Element");
								testCase = extent.createTest("11.ADD-SBU-CURSOR");
							}
				 
				 
			//Add SBU Button OPACITY 

					try {
							String Actualopacity = Addsbu.AddSBUbutton.getCssValue("opacity");
							System.out.println("OPACITY :" + Actualopacity);
							
							String Expectedopacity = "1";
							testCase = extent.createTest("12.ADD-SBU-OPACITY");
							try {
								AssertJUnit.assertEquals(Actualopacity, Expectedopacity);
								testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
								testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
								testCase.log(Status.PASS,  "correct");
							}
							catch(AssertionError e) {
								testCase.log(Status.INFO, "ActualTextTransformation :- " + Actualopacity);
								testCase.log(Status.INFO, "ExpectedTextTransformation :- " + Expectedopacity);
								testCase.log(Status.FAIL,  "wrong");
							}
						}
						catch (Exception e) {
								testCase = extent.createTest("12.ADD-SBU-OPACITY");
								testCase.log(Status.FAIL,  "No Element");
							}
					 
				
			//Add SBU Button HEIGHT

					try {	 
							String ActualHeight =Addsbu.AddSBUbutton.getCssValue("height");
							System.out.println("Height :" + ActualHeight);
							String ExpectedHeight = "32px";
							testCase = extent.createTest("13.ADD-SBU-HEIGHT");
							try {
								AssertJUnit.assertEquals(ActualHeight, ExpectedHeight);
								testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
								testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
								testCase.log(Status.PASS, "correct");
							} catch(AssertionError e) {
								testCase.log(Status.INFO, "ActualLineHeight :- " + ActualHeight);
								testCase.log(Status.INFO, "ExpectedLineHeight :- " + ExpectedHeight);
								testCase.log(Status.FAIL, "wrong");
							}
						}
						catch(Exception e) {
								testCase = extent.createTest("13.ADD-SBU-HEIGHT");
								testCase.log(Status.FAIL, "No element");	
							}
				

				
			//Add SBU Button WIDTH


					try {	 
							String Actualwidth =Addsbu.AddSBUbutton.getCssValue("width");
							System.out.println("width :" + Actualwidth);
						
							String Expectedwidth = "180px";
							testCase = extent.createTest("14.ADD-SBU-WIDTH");
							try {
								AssertJUnit.assertEquals(Actualwidth, Expectedwidth);
								testCase.log(Status.INFO, "Actualwidth :- " + Actualwidth);
								testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
								testCase.log(Status.PASS, "correct");
							} catch(AssertionError e) {
								testCase.log(Status.INFO, "Actualwidth  :- " + Actualwidth);
								testCase.log(Status.INFO, "Expectedwidth  :- " + Expectedwidth);
								testCase.log(Status.FAIL, "wrong");
							}
					   }
					    catch(Exception e) {
							testCase = extent.createTest("14.ADD-SBU-WIDTH");
							testCase.log(Status.FAIL, "No element");	
						}
					
				

			//Add SBU Button Font-weight

					try {
							String Actualweight = Addsbu.AddSBUbutton.getCssValue("font-weight");
							System.out.println("16.Font-weight :" + Actualweight);
							String Expectedweight = "400";
							testCase = extent.createTest("15.ADD-SBU-FONT-WEIGHT");
							try {
								AssertJUnit.assertEquals(Actualweight, Expectedweight);
								testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
								testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
								testCase.log(Status.PASS, "correct");
							} catch(AssertionError e) {
								testCase.log(Status.INFO, "Actualfontweight :- " + Actualweight);
								testCase.log(Status.INFO, "Expectedfontweight :- " + Expectedweight);
								testCase.log(Status.FAIL, "wrong");
							}
						} 
					catch(Exception e) {
						testCase.log(Status.FAIL, "No Element");
						testCase = extent.createTest("15.ADD-SBU-FONT-WEIGHT");
					}
		 
		 
	}
	
	public void AddSBUData() throws IOException, InterruptedException {
		
		

        PageFactory.initElements(driver, adsbu);
		
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\data\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("AddSbu");

		int rowcount = sheet.getLastRowNum();
		for (int i = 0; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);

			String sbu = (String) row.getCell(0).getStringCellValue();
			String description = (String) row.getCell(1).getStringCellValue();
			
			Thread.sleep(3000);

			Addsbu.AddSBUbutton.click();
			Addsbu.SBUtextbox.sendKeys(sbu); 
			Addsbu.Descriptiontextbox.sendKeys(description);
			
			
			Addsbu.SBUsavebutton.click();



		}









            }	
}
	


