package aws.carddemo.file;

import aws.carddemo.variable.Cbact04cVariableContainer;
import aws.carddemo.variable.group.Cbact04cFdXreffileRec;
import com.tmax.openframe.runtime.context.OpenFrameContext;
import com.tmax.openframe.runtime.file.FileBaseOperation;
import com.tmax.openframe.runtime.file.FileStatus;
import com.tmax.openframe.runtime.file.KeyOperationType;
import java.math.*;
import java.util.*;
import lombok.*;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:55 UTC</p>
 * <hr>
 * <p>Class that defines file I/O methods</p>
 * <ul>
 * <li>File description name: XREF-FILE</li>
 * <li>file record class: {@link Cbact04cFdXreffileRec}</li>
 * <li>key field: {@link Cbact04cFdXreffileRec#fdXrefCardNum}</li>
 * </ul>
 */
public abstract class Cbact04cFileOpXrefFile implements
        FileBaseOperation<Cbact04cFdXreffileRec, String> {
    public Cbact04cFdXreffileRec readNext(OpenFrameContext context) {
        if (getFileStatus(context) == FileStatus.AT_END_CONDITION_SEQ_READ) {
            setFileStatus(context, FileStatus.ALREADY_AT_END_CONDITION);
            return null;
        } else {
            return readNextRecord(context);
        }
    }

    public void setFileStatus(OpenFrameContext context, FileStatus status) {
        Cbact04cVariableContainer container = (Cbact04cVariableContainer) context
                .getProgramVariableContainer("Cbact04c");
        container.getXreffileStatus().set(status.getValue());
        context.setFileStatus("Cbact04c", "XrefFile", status);
    }

    public FileStatus getFileStatus(OpenFrameContext context) {
        return context.getFileStatus("Cbact04c", "XrefFile");
    }

    public abstract void startAix(OpenFrameContext context, Long key,
            KeyOperationType type);

    public abstract Cbact04cFdXreffileRec readAixKey(OpenFrameContext context,
            Long key);
}
