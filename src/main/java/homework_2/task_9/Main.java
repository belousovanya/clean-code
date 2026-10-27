package homework_2.task_9;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor doc = new DOCProcessor();
        DocumentProcessor pdf = new DocumentAdapter(new PDFProcessor());

        doc.process();
        pdf.process();
    }
}
