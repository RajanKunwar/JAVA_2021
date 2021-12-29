#Object Stream

Just as data streams support I/O of primitive data types, object streams support I/O of objects. Using a fixed-length record format is a good choice if you need to store data of the same type. However, objects that you create in an object-oriented program are rarely all of the same type. For example, you may have an array called staff that is nominally an array of Employee records but contains objects that are actually instances of a child class such as Manager. If we want to save files that contain this kind of information, we must first save the type of each object and then the data that defines the current state of the object. When we read this information back from a file, we must:

.Read the object type;

.Create a blank object of that type;

.Fill it with the data that we stored in the file.

It is entirely possible (if very tedious) to do this by hand. Sun Microsystems developed a powerful mechanism that allows this to be done with much less effort. This mechanism is called object serialization, almost completely automates what was previously a very tedious process.
