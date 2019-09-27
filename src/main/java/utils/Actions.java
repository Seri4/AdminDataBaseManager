package utils;

import java.util.List;

public interface Actions {
    public void createEntry();

    public void deleteEntry(Object currentEntry);

    public void updateEntry(Object currentEntry);

    public List<Object> getAllEntries();

    public Object getEntryById(int id);
}
