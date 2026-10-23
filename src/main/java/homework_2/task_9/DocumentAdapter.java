package homework_2.task_9;

public class DocumentAdapter implements DocumentProcessor {
    private PDFProcessor pdfProcessor;

    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
        pdfProcessor.process();
        System.out.println("Конвертируем PDF в DOC");
        System.out.println("Документ готов для работы с DOC");
    }
}
