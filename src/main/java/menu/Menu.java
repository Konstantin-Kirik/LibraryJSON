package menu;
import writer.WriterAuthor;
import java.util.List;

public interface Menu {

    void sortData(List<WriterAuthor> sort);
    List<WriterAuthor> findData(List<WriterAuthor> find);
}
