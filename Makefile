MarkdownParse.class: MardownParse.java
	javac MarkdownParse.java

MarkdownParseTest.class: MarkdownParseTest.java MarkdownParseTest.class
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
	
Test: MarkdownParse.class MarkdownParseTest.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

