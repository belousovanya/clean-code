package homework_2.task_9;

public class DocumentAdapter implements DocumentProcessor {
    private final PDFProcessor pdfProcessor;

    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
        pdfProcessor.processPdf();
    }
}
