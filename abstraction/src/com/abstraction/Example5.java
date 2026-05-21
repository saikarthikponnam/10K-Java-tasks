package com.abstraction;

abstract class ReportGenerator{
	String title;
	
	public ReportGenerator(String title) {
		super();
		this.title = title;
	}
	public abstract void generateContent();
	public void openFile() {
		System.out.println("Opening");
	}
	public void writeContent() {
		System.out.println("Writing");
	}
	public void saveFile() {
		System.out.println("Saving");
	}
}
class PDFReport extends ReportGenerator{
	String blockText;
	
	public PDFReport(String title, String blockText) {
		super(title);
		this.blockText = blockText;
	}
	@Override
	public void generateContent() {
		System.out.println("Generating PDF content with block text.");
	}
	public void openFile() {
		System.out.println("Opening PDF file.");
	}
	public void writeContent() {
		System.out.println("Writing content to PDF file.");
	}
	public void saveFile() {
		System.out.println("Saving PDF file.");
	}
}
class ExcelReport extends ReportGenerator{
	String[][] tabularData;

	public ExcelReport(String title, String[][] tabularData) {
		super(title);
		this.tabularData = tabularData;
	}

	@Override
	public void generateContent() {
		System.out.println("Generating Excel content with block text.");
	}
	public void openFile() {
		System.out.println("Opening Excel file.");
	}
	public void writeContent() {
		System.out.println("Writing content to Excel file.");
	}
	public void saveFile() {
		System.out.println("Saving Excel file.");
	}
}
class HTMLReport extends ReportGenerator {
	String markupContent;

	public HTMLReport(String title, String markupContent) {
		super(title);
		this.markupContent = markupContent;
	}

	@Override
	public void generateContent() {
		System.out.println("Generating HTML content with block text.");
	}
	public void openFile() {
		System.out.println("Opening HTML file.");
	}
	public void writeContent() {
		System.out.println("Writing content to HTML file.");
	}
	public void saveFile() {
		System.out.println("Saving HTML file.");
	}
	
}
public class Example5 {

	public static void main(String[] args) {
		ReportGenerator rp = new PDFReport("Sample Report", "This is a sample block text.");
		rp.generateContent();
		rp.openFile();
		rp.writeContent();
		rp.saveFile();
		System.out.println();
		
		ReportGenerator rp1 = new ExcelReport("Sample Report", new String[][]{{"Name", "Age"}, {"John", "30"}, {"Jane", "25"}});
		rp1.generateContent();
		rp1.openFile();
		rp1.writeContent();
		rp1.saveFile();
		System.out.println();
		
		ReportGenerator rp2 = new HTMLReport("Sample Report", "<h1>Sample Report</h1> <p>This is a sample report.</p>");
		rp2.generateContent();
		rp2.openFile();
		rp2.writeContent();
		rp2.saveFile();
		System.out.println();
		
		
		

	}

}
