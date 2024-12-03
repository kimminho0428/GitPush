package aws.carddemo.batch;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Configuration;
import com.tmax.openframe.batch.runtime.data.Dd;
import java.util.Map;
import java.util.HashMap;
import com.tmax.openframe.runtime.context.OpenFrameContext;
import org.springframework.context.annotation.ComponentScan;
import aws.carddemo.Cbact02c;
import org.mybatis.spring.annotation.MapperScan;

/** 
 * <p>This source code was generated by T-Up OpenFrame COBOL to Java migrator</p>
 * <p>  Generation date : 2024/05/02 05:55:55 UTC</p>
 * <hr>
 * <p>tasklet class for executing converted COBOL program</p>
 * <ul>
 * <li>converted COBOL program: {@link aws.carddemo.Cbact02c}</li>
 * </ul>
 */
@Getter
@Setter
@RequiredArgsConstructor
@Configuration
@ComponentScan(basePackages = "aws.carddemo")
@ComponentScan(basePackages = "com.tmax.openframe.runtime.*")
@MapperScan(basePackages = { "aws.carddemo.dao" })
public class Cbact02cTasklet implements Tasklet {
    private Map<String, Dd> dd;
    private String parm;
    private final Cbact02c program;

    @Override
    public RepeatStatus execute(StepContribution contribution,
            ChunkContext chunkContext) throws Exception {
        Map<String, Object> genericContext = new HashMap<>();
        genericContext.put(OpenFrameContext.DD_LIST, dd);
        int returnValue = program.run(genericContext);
        contribution.setExitStatus(new ExitStatus(String.valueOf(returnValue)));
        return RepeatStatus.FINISHED;
    }
}
