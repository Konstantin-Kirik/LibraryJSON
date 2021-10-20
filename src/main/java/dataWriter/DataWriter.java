package dataWriter;

import writer.WriterAuthor;

import java.util.List;

public class DataWriter {

    private List<WriterAuthor> writerList;

    public DataWriter(List<WriterAuthor> writerList) {
        this.writerList = writerList;
    }

    public void setWriterList(List<WriterAuthor> writerList) {
        this.writerList = writerList;
    }

    @Override
    public String toString() {
        return "DataWriter" + "\n" +"{" +
                writerList +
                "}";
    }
}
