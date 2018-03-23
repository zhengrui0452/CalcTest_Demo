mkdir test_class

javac -d test_class test_src/*.java

del *.txt

mkdir bin

javac -d bin src/*.java

java -cp bin Main 4

java -cp bin Main abc

java -cp test_class Main 4 ArithmeticExpression.txt
