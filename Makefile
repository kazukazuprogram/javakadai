target = abc177_c
sample = 1

all: compile run clean

compile:
	javac $(target)_nostdin.java

run:
	java Main < $(target)_$(sample).txt

clean:
	rm Main.class
