What is a stream ?

Stream is a mechanism which  used to perform data flow from source to destination known as stream.
Eg:(Water pipe Line)

                   ____________________________
        Source     ============================   Destination
        (I/P)      ____________________________		(O/P)		   
		
Streams are used to send or recevie data  through diffrent sources.Receving data such as Keyboard,Scanner etc.
**Byte Streams:Represent data in individual(1 byte) bytes.
   If the class Name ends with Stream then it will consider as byte Stream
   Eg: FileInputStream: Is used to read data  from a file in sequence of bytes
       FileOutputStream
	   ObjectInputStream
	   ObjectOutputStream
	   BufferedInputStream
	   BufferedOutputStream.....etc
    Byte Streams are used to handle any type of images audio and vedio files(which having 1 byte).
**Text Streams: Represents data in characters of each 2 bytes.
   If the class Name ends with Reader or writer then it will consider as text streams .
   
   FileReader
   FileWriter
   PrintWriter
   BufferedWriter
   BufferedReader
   
   Text Stream are used to handle the characters means suitable to handle text files (2 bytes)

Streams are diffrentiated in to two categories:
1.InputStream(1 byte)
2.OutPutStream(1 byte)
3.Writer(2 byte)
4.Reader(2 bytes)

Serializable:-
---------------
Def: In java Serializable is an marker interface,which is used to serilaize and deserialize a class by implementing serializable interface.

Serialization & De-Serilization:

Serialization allows us to convert the state of an object into a byte stream.

Note:- The serialization process is platform independent, an object which serialized on one platform can be deserialized on a diffrent platform
 
De-Serilization allows us to convert serilized byte stream into an object.

Note:-Any class that implements Serializable interface directly  or throgh its parent can be Serialized,and classes that do not implement Serializable can not be Serialized.
   When a class implements the Serializable interface,all its sub classes are Serializable.But when an object has a refrence to another object,these objects must implements Serializable interface seperatley.

Note:tranisent and static  fields cannot be Serialized.





transient modifier/keyword  and static keyword is used for only variables---it will hide the value at display time.

