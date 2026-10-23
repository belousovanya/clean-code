package homework_2.task_9;

public class Main {
    public static void main(String[] args) {
        DocumentProcessor doc = new DOCProcessor();
        PDFProcessor pdf = new PDFProcessor();
        DocumentProcessor adapter = new DocumentAdapter(pdf);

        doc.process();
        adapter.process();
    }
}