class FileIO {
    static void main(String []args)
    {
        // Writing to the file
        def values = 1..3;
        new File("test.txt").withWriter('utf-8') {
            writer -> for (i in values) {
                writer.writeLine("This is line $i");
            }
        }

        // Reading the file
        new File("test.txt").eachLine {
            line -> println(line);
        }

        // Append the file
        println("Appending Line to the file:");
        File file = new File("test.txt");
        file.append('Line 11');
        println(file.text);

        // Get File properties
        println("File Size: ${file.length()}");
        println("DIR: ${file.isDirectory()}");

        // New File from old file
        def newFile = new File("test2.txt");
        newFile << file.text;
        println("New files content are:");
        println(newFile.text);

        // Delete the file
        newFile.delete();
        println(newFile.exists());

        
    }
}