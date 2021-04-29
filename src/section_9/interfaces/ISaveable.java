package section_9.interfaces;

import java.util.List;

public interface ISaveable {
  List<String> write();
  void read(List<String> values);
}
