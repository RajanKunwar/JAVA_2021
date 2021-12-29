#Stream

All fundamental i/o operation in java is based on streams. A stream represents a flow of data, or channel of communication with a writer at one end and reader at other end. when you are working with terminal input and output , reading or writing files, or communicating through sockets in java,you are using a stream of one type to another.

No matter the information is comming from or going to and no matter what type of data is being read or written, the algorithm for reading and writing data is pretty much always the same.

.Reading
-open a stream
-while more information
-read information
-close the stream

.Writing
-open a stream
-while more information
-write information
-close the stream The java.io package contains a collection of stream classes that supports above mentioned algorithms.

.Classification of Stream classes:
-Byte stream : provides support for handeling i/o operations on bytes.
-Character stream : provides support for managing i/o operations on characters.

It is to be remembered that streams in java are one-way streets.
The java.io input and output classes represent the ends of a simple stream.
For bi-directional conversations, we have to use one of each type of stream
