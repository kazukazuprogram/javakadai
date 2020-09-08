target = abc177_c
sample = 1

all: compile run clean

compile:
	javac $(target).java

run:
	java Main < $(target)_$(sample).txt

clean:
	del Main.class
