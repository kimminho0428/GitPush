package aws.carddemo.file;

import aws.carddemo.dao.*;
import aws.carddemo.dto.*;
import aws.carddemo.mapper.*;
import aws.carddemo.variable.group.Cbtrn02cFdTranfileRec;
import com.tmax.openframe.runtime.context.OpenFrameContext;
import com.tmax.openframe.runtime.file.FileStatus;
import com.tmax.openframe.runtime.file.KeyOperationType;
import com.tmax.openframe.runtime.file.RecordCommitter;
import java.math.*;
import java.util.*;
import lombok.*;
import org.apache.ibatis.executor.BatchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:56 UTC</p>
 * <hr>
 * <p>Class for processing file I/O operations</p>
 * <ul>
 * <li>target dataset: AwsM2CarddemoTransactVsamKsds</li>
 * <li>file operation class: {@link Cbtrn02cFileOpTransactFile}</li>
 * <li>DAO class: {@link AwsM2CarddemoTransactVsamKsdsDao}</li>
 * <li>DTO class: {@link AwsM2CarddemoTransactVsamKsdsDto}</li>
 * </ul>
 */
@Repository
public class Cbtrn02cFdTransactFile extends Cbtrn02cFileOpTransactFile {
    @Autowired
    private AwsM2CarddemoTransactVsamKsdsDao dao;
    @Autowired
    private RecordCommitter<AwsM2CarddemoTransactVsamKsdsDto> committer;

    public void open(OpenFrameContext context) {
        setIterator(context, dao.readAllAsc().iterator());
        setFileStatus(context, FileStatus.NORMAL);
        context.initFileWriteBuffer("Cbtrn02c", "TransactFile");
        committer.setThreshold(5000);
    }

    public void start(OpenFrameContext context, String key,
            KeyOperationType type) {
        Cbtrn02cFdTranfileRec startPoint = new Cbtrn02cFdTranfileRec();
        startPoint.setFdTransId(key);
        AwsM2CarddemoTransactVsamKsdsDto dto = Cbtrn02cMapperInterface.Cbtrn02cFdTranfileRecKeyToAwsM2CarddemoTransactVsamKsdsDto.INSTANCE
                .toTarget(startPoint);
        switch (type) {
        case EQ:
        case GTEQ: {
            setIterator(context, dao.readGeDto(dto).iterator());
            break;
        }
        case GT: {
            setIterator(context, dao.readGtDto(dto).iterator());
            break;
        }
        default: {
            throw new RuntimeException(
                    "not supported operation for start method");
        }
        }
        if (!getIterator(context).hasNext()) {
            setFileStatus(context, FileStatus.INVALID_KEY_READ);
        } else {
            setFileStatus(context, FileStatus.NORMAL);
        }
    }

    public Cbtrn02cFdTranfileRec readNextRecord(OpenFrameContext context) {
        Iterator<AwsM2CarddemoTransactVsamKsdsDto> iterator = getIterator(context);
        if (iterator.hasNext()) {
            AwsM2CarddemoTransactVsamKsdsDto nextRecord = iterator.next();
            if (nextRecord == null) {
                setFileStatus(context, FileStatus.AT_END_CONDITION_SEQ_READ);
                return null;
            }
            setFileStatus(context, FileStatus.NORMAL);
            return Cbtrn02cMapperInterface.Cbtrn02cFdTranfileRecToAwsM2CarddemoTransactVsamKsdsDto.INSTANCE
                    .toSource(nextRecord);
        } else {
            setFileStatus(context, FileStatus.AT_END_CONDITION_SEQ_READ);
            return null;
        }
    }

    public Cbtrn02cFdTranfileRec readKey(OpenFrameContext context, String key) {
        commit(context);
        Cbtrn02cFdTranfileRec readKeyPoint = new Cbtrn02cFdTranfileRec();
        readKeyPoint.setFdTransId(key);
        AwsM2CarddemoTransactVsamKsdsDto dto = Cbtrn02cMapperInterface.Cbtrn02cFdTranfileRecKeyToAwsM2CarddemoTransactVsamKsdsDto.INSTANCE
                .toTarget(readKeyPoint);
        Iterator<AwsM2CarddemoTransactVsamKsdsDto> iterator = dao
                .readEqDto(dto).iterator();
        setIterator(context, iterator);
        if (iterator.hasNext()) {
            setFileStatus(context, FileStatus.NORMAL);
            return Cbtrn02cMapperInterface.Cbtrn02cFdTranfileRecToAwsM2CarddemoTransactVsamKsdsDto.INSTANCE
                    .toSource(iterator.next());
        } else {
            setFileStatus(context, FileStatus.INVALID_KEY_READ);
            return null;
        }
    }

    public void write(OpenFrameContext context, Cbtrn02cFdTranfileRec data) {
        List<AwsM2CarddemoTransactVsamKsdsDto> writeBuffer = getWriteBuffer(context);
        writeBuffer
                .add(Cbtrn02cMapperInterface.Cbtrn02cFdTranfileRecToAwsM2CarddemoTransactVsamKsdsDto.INSTANCE
                        .toTarget(data));
        if (writeBuffer.size() >= committer.getThreshold()) {
            committer.commit(dao::writeDto, writeBuffer);
            writeBuffer.clear();
        }
        setFileStatus(context, FileStatus.NORMAL);
    }

    public void rewrite(OpenFrameContext context, Cbtrn02cFdTranfileRec data,
            String key) {
        commit(context);
        data.setFdTransId(key);
        AwsM2CarddemoTransactVsamKsdsDto updateDto = Cbtrn02cMapperInterface.Cbtrn02cFdTranfileRecToAwsM2CarddemoTransactVsamKsdsDto.INSTANCE
                .toTarget(data);
        dao.flush();
        dao.rewriteDto(updateDto);
        List<BatchResult> resultList = dao.flush();
        if (resultList.get(0).getUpdateCounts()[0] > 0) {
            setFileStatus(context, FileStatus.NORMAL);
        } else {
            setFileStatus(context, FileStatus.INVALID_KEY_CREATE);
        }
    }

    public void delete(OpenFrameContext context, String key) {
        if (getIterator(context) == null) {
            return;
        }
        commit(context);
        Cbtrn02cFdTranfileRec deletePoint = new Cbtrn02cFdTranfileRec();
        deletePoint.setFdTransId(key);
        AwsM2CarddemoTransactVsamKsdsDto dto = Cbtrn02cMapperInterface.Cbtrn02cFdTranfileRecKeyToAwsM2CarddemoTransactVsamKsdsDto.INSTANCE
                .toTarget(deletePoint);
        dao.flush();
        dao.deleteDto(dto);
        List<BatchResult> resultList = dao.flush();
        if (resultList.get(0).getUpdateCounts()[0] > 0) {
            setFileStatus(context, FileStatus.NORMAL);
        } else {
            setFileStatus(context, FileStatus.INVALID_KEY_READ);
        }
    }

    public void close(OpenFrameContext context) {
        commit(context);
        setIterator(context, null);
        setFileStatus(context, FileStatus.NORMAL);
    }

    public void commit(OpenFrameContext context) {
        List<AwsM2CarddemoTransactVsamKsdsDto> writeBuffer = getWriteBuffer(context);
        if (writeBuffer != null && writeBuffer.size() > 0) {
            committer.commit(dao::writeDto, writeBuffer);
            writeBuffer.clear();
        }
    }

    private void setIterator(OpenFrameContext context,
            Iterator<AwsM2CarddemoTransactVsamKsdsDto> iterator) {
        context.setFileIterator("Cbtrn02c", "TransactFile", iterator);
    }

    private Iterator<AwsM2CarddemoTransactVsamKsdsDto> getIterator(
            OpenFrameContext context) {
        return context.getFileIterator("Cbtrn02c", "TransactFile");
    }

    private List<AwsM2CarddemoTransactVsamKsdsDto> getWriteBuffer(
            OpenFrameContext context) {
        return context.getFileWriteBuffer("Cbtrn02c", "TransactFile");
    }
}
