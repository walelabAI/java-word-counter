    try {  
        File file = new File("input.txt");  
        Scanner scanner = new Scanner(file);  

        while (scanner.hasNext()) {  
            scanner.next();  
            count++;  
        }  

        scanner.close();  
        System.out.println("Total words: " + count);  

    } catch (FileNotFoundException e) {  
        System.out.println("File not found.");  
    }  
}  
