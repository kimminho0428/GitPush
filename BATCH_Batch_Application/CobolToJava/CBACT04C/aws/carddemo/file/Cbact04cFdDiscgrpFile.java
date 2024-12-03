package aws.carddemo.file;

import aws.carddemo.dao.*;
import aws.carddemo.dto.*;
import aws.carddemo.mapper.*;
import aws.carddemo.variable.group.Cbact04cFdDiscgrpRec;
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
 * <p>  Generation date : 2024/05/02 05:55:55 UTC</p>
 * <hr>
 * <p>Class for processing file I/O operations</p>
 * <ul>
 * <li>target dataset: AwsM2CarddemoDiscgrpVsamKsds</li>
 * <li>file operation class: {@link Cbact04cFileOpDiscgrpFile}</li>
 * <li>DAO class: {@link AwsM2CarddemoDiscgrpVsamKsdsDao}</li>
 * <li>DTO class: {@link AwsM2CarddemoDiscgrpVsamKsdsDto}</li>
 * </ul>
 */
@Repository
public class Cbact04cFdDiscgrpFile extends Cbact04cFileOpDiscgrpFile {
    @Autowired
    private AwsM2CarddemoDiscgrpVsamKsdsDao dao;
    @Autowired
    private RecordCommitter<AwsM2CarddemoDiscgrpVsamKsdsDto> committer;

    public void open(OpenFrameContext context) {
        setIterator(context, dao.readAllAsc().iterator());
        setFileStatus(context, FileStatus.NORMAL);
        context.initFileWriteBuffer("Cbact04c", "DiscgrpFile");
        committer.setThreshold(5000);
    }

    public void start(OpenFrameContext context,
            Cbact04cFdDiscgrpRec.Cbact04cFdDiscgrpKey key, KeyOperationType type) {
        Cbact04cFdDiscgrpRec startPoint = new Cbact04cFdDiscgrpRec();
        startPoint.setFdDiscgrpKey(key);
        AwsM2CarddemoDiscgrpVsamKsdsDto dto = Cbact04cMapperInterface.Cbact04cFdDiscgrpRecKeyToAwsM2CarddemoDiscgrpVsamKsdsDto.INSTANCE
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

    public Cbact04cFdDiscgrpRec readNextRecord(OpenFrameContext context) {
        Iterator<AwsM2CarddemoDiscgrpVsamKsdsDto> iterator = getIterator(context);
        if (iterator.hasNext()) {
            AwsM2CarddemoDiscgrpVsamKsdsDto nextRecord = iterator.next();
            if (nextRecord == null) {
                setFileStatus(context, FileStatus.AT_END_CONDITION_SEQ_READ);
                return null;
            }
            setFileStatus(context, FileStatus.NORMAL);
            return Cbact04cMapperInterface.Cbact04cFdDiscgrpRecToAwsM2CarddemoDiscgrpVsamKsdsDto.INSTANCE
                    .toSource(nextRecord);
        } else {
            setFileStatus(context, FileStatus.AT_END_CONDITION_SEQ_READ);
            return null;
        }
    }

    public Cbact04cFdDiscgrpRec readKey(OpenFrameContext context,
            Cbact04cFdDiscgrpRec.Cbact04cFdDiscgrpKey key) {
        commit(context);
        Cbact04cFdDiscgrpRec readKeyPoint = new Cbact04cFdDiscgrpRec();
        readKeyPoint.setFdDiscgrpKey(key);
        AwsM2CarddemoDiscgrpVsamKsdsDto dto = Cbact04cMapperInterface.Cbact04cFdDiscgrpRecKeyToAwsM2CarddemoDiscgrpVsamKsdsDto.INSTANCE
                .toTarget(readKeyPoint);
        Iterator<AwsM2CarddemoDiscgrpVsamKsdsDto> iterator = dao.readEqDto(dto)
                .iterator();
        setIterator(context, iterator);
        if (iterator.hasNext()) {
            setFileStatus(context, FileStatus.NORMAL);
            return Cbact04cMapperInterface.Cbact04cFdDiscgrpRecToAwsM2CarddemoDiscgrpVsamKsdsDto.INSTANCE
                    .toSource(iterator.next());
        } else {
            setFileStatus(context, FileStatus.INVALID_KEY_READ);
            return null;
        }
    }

    public void write(OpenFrameContext context, Cbact04cFdDiscgrpRec data) {
        List<AwsM2CarddemoDiscgrpVsamKsdsDto> writeBuffer = getWriteBuffer(context);
        writeBuffer
                .add(Cbact04cMapperInterface.Cbact04cFdDiscgrpRecToAwsM2CarddemoDiscgrpVsamKsdsDto.INSTANCE
                        .toTarget(data));
        if (writeBuffer.size() >= committer.getThreshold()) {
            committer.commit(dao::writeDto, writeBuffer);
            writeBuffer.clear();
        }
        setFileStatus(context, FileStatus.NORMAL);
    }

    public void rewrite(OpenFrameContext context, Cbact04cFdDiscgrpRec data,
            Cbact04cFdDiscgrpRec.Cbact04cFdDiscgrpKey key) {
        commit(context);
        data.setFdDiscgrpKey(key);
        AwsM2CarddemoDiscgrpVsamKsdsDto updateDto = Cbact04cMapperInterface.Cbact04cFdDiscgrpRecToAwsM2CarddemoDiscgrpVsamKsdsDto.INSTANCE
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

    public void delete(OpenFrameContext context,
            Cbact04cFdDiscgrpRec.Cbact04cFdDiscgrpKey key) {
        if (getIterator(context) == null) {
            return;
        }
        commit(context);
        Cbact04cFdDiscgrpRec deletePoint = new Cbact04cFdDiscgrpRec();
        deletePoint.setFdDiscgrpKey(key);
        AwsM2CarddemoDiscgrpVsamKsdsDto dto = Cbact04cMapperInterface.Cbact04cFdDiscgrpRecKeyToAwsM2CarddemoDiscgrpVsamKsdsDto.INSTANCE
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
        List<AwsM2CarddemoDiscgrpVsamKsdsDto> writeBuffer = getWriteBuffer(context);
        if (writeBuffer != null && writeBuffer.size() > 0) {
            committer.commit(dao::writeDto, writeBuffer);
            writeBuffer.clear();
        }
    }

    private void setIterator(OpenFrameContext context,
            Iterator<AwsM2CarddemoDiscgrpVsamKsdsDto> iterator) {
        context.setFileIterator("Cbact04c", "DiscgrpFile", iterator);
    }

    private Iterator<AwsM2CarddemoDiscgrpVsamKsdsDto> getIterator(
            OpenFrameContext context) {
        return context.getFileIterator("Cbact04c", "DiscgrpFile");
    }

    private List<AwsM2CarddemoDiscgrpVsamKsdsDto> getWriteBuffer(
            OpenFrameContext context) {
        return context.getFileWriteBuffer("Cbact04c", "DiscgrpFile");
    }
}
