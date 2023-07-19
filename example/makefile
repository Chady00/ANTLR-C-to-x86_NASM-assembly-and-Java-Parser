ANTLR_JAR=antlr-4.9.2-complete.jar
SRC_FILES=$(wildcard *.java)
ANTLR_GENERATED_FILES=MyLanguageV1Code*.java MyLanguageV1Code*.tokens
EXAMPLE_FILE=example.txt

.PHONY: all clean

all: program

program: $(SRC_FILES)
	javac -cp $(ANTLR_JAR) $(SRC_FILES)

$(ANTLR_GENERATED_FILES): MyLanguageV1Code.g4
	java -jar $(ANTLR_JAR) MyLanguageV1Code.g4

example.txt: 

clean:
	rm -f $(ANTLR_GENERATED_FILES) *.class

run: program example.txt
	java -cp $(ANTLR_JAR):. MyLanguageV1Code $(EXAMPLE_FILE)
