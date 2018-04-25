# The challenge

Do you know what a **Tweetstorm** is?

It's a way to bypass Twitter's blessed 140 chars limit.

It allows you to break down a larger corpus of text into tweets and post them in quick
succession, forming a cohesive whole.

Since Twitter can barely count (and monotonically increasing numbers is hard!), the final order
in which users will see the sequence might not be the one you posted. Or someone retweeted it, losing context.

In order to keep some sense of narrative and connection you prefix each piece of the corpus
with the part that it represents (1/4, then 2/4 then 3/4 then 4/4).

**The assignment: Create a program that receives a text or arbitrary length and creates a
tweetstorm with it.**

Freedom is overrated. Here our constrains:

1. Each tweet can't be over 140 characters,

2. Each tweet must be prefixed with the current index / total count.

3. We'll call your program from a Unix shell, like /opt/hiring/yourname/tweetstormgenerator, with the text corpus passed 
as a parameter

4. You can choose any language you would like, but stick to its built in library (if actually think you need a third-party 
lib to achieve this, we're curious to know what that would be). Please don't choose brainfuck, we're afraid we might 
actually enjoy reading it.

# Executing the application

You must install [Maven](https://maven.apache.org/) and [Java](https://www.java.com) on your system. Once installed, 
clone the repository and, in the root directory, I run the `mvn clean package` command. The application will be tested, 
compiled, and a *.jar* file will be generated within the *target* folder. Then run the command below to run the 
application, replacing the tweetstorm generator **Text**.

`java -jar target\tweetstorm-generator.jar "Text"`

# Possible Improvements:

* Create friendly interface.

# Code maintenance

All of the code is well documented and tested, which makes maintaining code very inexpensive.