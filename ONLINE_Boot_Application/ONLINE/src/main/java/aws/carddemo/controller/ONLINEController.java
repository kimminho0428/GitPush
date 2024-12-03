package aws.carddemo.controller;

import aws.carddemo.util.CommareaMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

import lombok.Synchronized;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tmax.openframe.online.service.api.Task;
import com.tmax.openframe.online.service.ScreenLoader;

import aws.carddemo.Coactupc;
import aws.carddemo.dto.CoactupcInputDto;
import aws.carddemo.dto.CoactupcOutputDto;
import aws.carddemo.Coactvwc;
import aws.carddemo.dto.CoactvwcInputDto;
import aws.carddemo.dto.CoactvwcOutputDto;
import aws.carddemo.Coadm01c;
import aws.carddemo.dto.Coadm01cInputDto;
import aws.carddemo.dto.Coadm01cOutputDto;
import aws.carddemo.Cobil00c;
import aws.carddemo.dto.Cobil00cInputDto;
import aws.carddemo.dto.Cobil00cOutputDto;
import aws.carddemo.Cocrdslc;
import aws.carddemo.dto.CocrdslcInputDto;
import aws.carddemo.dto.CocrdslcOutputDto;
import aws.carddemo.Cocrdlic;
import aws.carddemo.dto.CocrdlicInputDto;
import aws.carddemo.dto.CocrdlicOutputDto;
import aws.carddemo.Cocrdupc;
import aws.carddemo.dto.CocrdupcInputDto;
import aws.carddemo.dto.CocrdupcOutputDto;
import aws.carddemo.Cosgn00c;
import aws.carddemo.dto.Cosgn00cInputDto;
import aws.carddemo.dto.Cosgn00cOutputDto;
import aws.carddemo.Comen01c;
import aws.carddemo.dto.Comen01cInputDto;
import aws.carddemo.dto.Comen01cOutputDto;
import aws.carddemo.Corpt00c;
import aws.carddemo.dto.Corpt00cInputDto;
import aws.carddemo.dto.Corpt00cOutputDto;
import aws.carddemo.Cotrn00c;
import aws.carddemo.dto.Cotrn00cInputDto;
import aws.carddemo.dto.Cotrn00cOutputDto;
import aws.carddemo.Cotrn01c;
import aws.carddemo.dto.Cotrn01cInputDto;
import aws.carddemo.dto.Cotrn01cOutputDto;
import aws.carddemo.Cotrn02c;
import aws.carddemo.dto.Cotrn02cInputDto;
import aws.carddemo.dto.Cotrn02cOutputDto;
import aws.carddemo.Cousr00c;
import aws.carddemo.dto.Cousr00cInputDto;
import aws.carddemo.dto.Cousr00cOutputDto;
import aws.carddemo.Cousr01c;
import aws.carddemo.dto.Cousr01cInputDto;
import aws.carddemo.dto.Cousr01cOutputDto;
import aws.carddemo.Cousr02c;
import aws.carddemo.dto.Cousr02cInputDto;
import aws.carddemo.dto.Cousr02cOutputDto;
import aws.carddemo.Cousr03c;
import aws.carddemo.dto.Cousr03cInputDto;
import aws.carddemo.dto.Cousr03cOutputDto;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v2/ONLINE")
public class ONLINEController {
  private final Object DFHTCL00 = new Object();
  private final ScreenLoader screenLoader;
  private final Coactupc coactupc;
  private final Coactvwc coactvwc;
  private final Coadm01c coadm01c;
  private final Cobil00c cobil00c;
  private final Cocrdslc cocrdslc;
  private final Cocrdlic cocrdlic;
  private final Cocrdupc cocrdupc;
  private final Cosgn00c cosgn00c;
  private final Comen01c comen01c;
  private final Corpt00c corpt00c;
  private final Cotrn00c cotrn00c;
  private final Cotrn01c cotrn01c;
  private final Cotrn02c cotrn02c;
  private final Cousr00c cousr00c;
  private final Cousr01c cousr01c;
  private final Cousr02c cousr02c;
  private final Cousr03c cousr03c;
  private final Task task;

  @PostMapping("/CAUP")
  public CoactupcOutputDto CAUP (@RequestBody CoactupcInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CoactupcOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CoactupcVariableContainer",
        CommareaMapper.mappingCoactupcDfhcommarea(task.getCommarea("CAUP")));
    coactupc.run(appContext);
    return (CoactupcOutputDto)task.popOutputDto();
  }

  @PostMapping("/CAUP/forward")
  public CoactupcOutputDto CAUPForward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new CoactupcOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CoactupcVariableContainer",
        CommareaMapper.mappingCoactupcDfhcommarea(task.getCommarea("CAUP")));
    coactupc.run(appContext);
    return (CoactupcOutputDto)task.popOutputDto();
  }

  @PostMapping("/CAUP/noti")
  public void CAUPNoti (@RequestBody CoactupcInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CoactupcOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CoactupcVariableContainer",
        CommareaMapper.mappingCoactupcDfhcommarea(task.getCommarea("CAUP")));
    coactupc.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (CoactupcOutputDto)task.popOutputDto());
  }

  @PostMapping("/CAVW")
  public CoactvwcOutputDto CAVW (@RequestBody CoactvwcInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CoactvwcOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CoactvwcVariableContainer",
        CommareaMapper.mappingCoactvwcDfhcommarea(task.getCommarea("CAVW")));
    coactvwc.run(appContext);
    return (CoactvwcOutputDto)task.popOutputDto();
  }

  @PostMapping("/CAVW/forward")
  public CoactvwcOutputDto CAVWForward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new CoactvwcOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CoactvwcVariableContainer",
        CommareaMapper.mappingCoactvwcDfhcommarea(task.getCommarea("CAVW")));
    coactvwc.run(appContext);
    return (CoactvwcOutputDto)task.popOutputDto();
  }

  @PostMapping("/CAVW/noti")
  public void CAVWNoti (@RequestBody CoactvwcInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CoactvwcOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CoactvwcVariableContainer",
        CommareaMapper.mappingCoactvwcDfhcommarea(task.getCommarea("CAVW")));
    coactvwc.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (CoactvwcOutputDto)task.popOutputDto());
  }

  @PostMapping("/CA00")
  public Coadm01cOutputDto CA00 (@RequestBody Coadm01cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Coadm01cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Coadm01cVariableContainer",
        CommareaMapper.mappingCoadm01cDfhcommarea(task.getCommarea("CA00")));
    coadm01c.run(appContext);
    return (Coadm01cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CA00/forward")
  public Coadm01cOutputDto CA00Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Coadm01cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Coadm01cVariableContainer",
        CommareaMapper.mappingCoadm01cDfhcommarea(task.getCommarea("CA00")));
    coadm01c.run(appContext);
    return (Coadm01cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CA00/noti")
  public void CA00Noti (@RequestBody Coadm01cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Coadm01cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Coadm01cVariableContainer",
        CommareaMapper.mappingCoadm01cDfhcommarea(task.getCommarea("CA00")));
    coadm01c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Coadm01cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CB00")
  public Cobil00cOutputDto CB00 (@RequestBody Cobil00cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cobil00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cobil00cVariableContainer",
        CommareaMapper.mappingCobil00cDfhcommarea(task.getCommarea("CB00")));
    cobil00c.run(appContext);
    return (Cobil00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CB00/forward")
  public Cobil00cOutputDto CB00Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cobil00cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cobil00cVariableContainer",
        CommareaMapper.mappingCobil00cDfhcommarea(task.getCommarea("CB00")));
    cobil00c.run(appContext);
    return (Cobil00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CB00/noti")
  public void CB00Noti (@RequestBody Cobil00cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cobil00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cobil00cVariableContainer",
        CommareaMapper.mappingCobil00cDfhcommarea(task.getCommarea("CB00")));
    cobil00c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cobil00cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CCDL")
  public CocrdslcOutputDto CCDL (@RequestBody CocrdslcInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CocrdslcOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdslcVariableContainer",
        CommareaMapper.mappingCocrdslcDfhcommarea(task.getCommarea("CCDL")));
    cocrdslc.run(appContext);
    return (CocrdslcOutputDto)task.popOutputDto();
  }

  @PostMapping("/CCDL/forward")
  public CocrdslcOutputDto CCDLForward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new CocrdslcOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdslcVariableContainer",
        CommareaMapper.mappingCocrdslcDfhcommarea(task.getCommarea("CCDL")));
    cocrdslc.run(appContext);
    return (CocrdslcOutputDto)task.popOutputDto();
  }

  @PostMapping("/CCDL/noti")
  public void CCDLNoti (@RequestBody CocrdslcInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CocrdslcOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdslcVariableContainer",
        CommareaMapper.mappingCocrdslcDfhcommarea(task.getCommarea("CCDL")));
    cocrdslc.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (CocrdslcOutputDto)task.popOutputDto());
  }

  @PostMapping("/CCLI")
  public CocrdlicOutputDto CCLI (@RequestBody CocrdlicInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CocrdlicOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdlicVariableContainer",
        CommareaMapper.mappingCocrdlicDfhcommarea(task.getCommarea("CCLI")));
    cocrdlic.run(appContext);
    return (CocrdlicOutputDto)task.popOutputDto();
  }

  @PostMapping("/CCLI/forward")
  public CocrdlicOutputDto CCLIForward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new CocrdlicOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdlicVariableContainer",
        CommareaMapper.mappingCocrdlicDfhcommarea(task.getCommarea("CCLI")));
    cocrdlic.run(appContext);
    return (CocrdlicOutputDto)task.popOutputDto();
  }

  @PostMapping("/CCLI/noti")
  public void CCLINoti (@RequestBody CocrdlicInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CocrdlicOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdlicVariableContainer",
        CommareaMapper.mappingCocrdlicDfhcommarea(task.getCommarea("CCLI")));
    cocrdlic.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (CocrdlicOutputDto)task.popOutputDto());
  }

  @PostMapping("/CCUP")
  public CocrdupcOutputDto CCUP (@RequestBody CocrdupcInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CocrdupcOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdupcVariableContainer",
        CommareaMapper.mappingCocrdupcDfhcommarea(task.getCommarea("CCUP")));
    cocrdupc.run(appContext);
    return (CocrdupcOutputDto)task.popOutputDto();
  }

  @PostMapping("/CCUP/forward")
  public CocrdupcOutputDto CCUPForward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new CocrdupcOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdupcVariableContainer",
        CommareaMapper.mappingCocrdupcDfhcommarea(task.getCommarea("CCUP")));
    cocrdupc.run(appContext);
    return (CocrdupcOutputDto)task.popOutputDto();
  }

  @PostMapping("/CCUP/noti")
  public void CCUPNoti (@RequestBody CocrdupcInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new CocrdupcOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("CocrdupcVariableContainer",
        CommareaMapper.mappingCocrdupcDfhcommarea(task.getCommarea("CCUP")));
    cocrdupc.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (CocrdupcOutputDto)task.popOutputDto());
  }

  @PostMapping("/CC00")
  public Cosgn00cOutputDto CC00 (@RequestBody Cosgn00cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cosgn00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cosgn00cVariableContainer",
        CommareaMapper.mappingCosgn00cDfhcommarea(task.getCommarea("CC00")));
    cosgn00c.run(appContext);
    return (Cosgn00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CC00/forward")
  public Cosgn00cOutputDto CC00Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cosgn00cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cosgn00cVariableContainer",
        CommareaMapper.mappingCosgn00cDfhcommarea(task.getCommarea("CC00")));
    cosgn00c.run(appContext);
    return (Cosgn00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CC00/noti")
  public void CC00Noti (@RequestBody Cosgn00cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cosgn00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cosgn00cVariableContainer",
        CommareaMapper.mappingCosgn00cDfhcommarea(task.getCommarea("CC00")));
    cosgn00c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cosgn00cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CM00")
  public Comen01cOutputDto CM00 (@RequestBody Comen01cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Comen01cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Comen01cVariableContainer",
        CommareaMapper.mappingComen01cDfhcommarea(task.getCommarea("CM00")));
    comen01c.run(appContext);
    return (Comen01cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CM00/forward")
  public Comen01cOutputDto CM00Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Comen01cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Comen01cVariableContainer",
        CommareaMapper.mappingComen01cDfhcommarea(task.getCommarea("CM00")));
    comen01c.run(appContext);
    return (Comen01cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CM00/noti")
  public void CM00Noti (@RequestBody Comen01cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Comen01cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Comen01cVariableContainer",
        CommareaMapper.mappingComen01cDfhcommarea(task.getCommarea("CM00")));
    comen01c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Comen01cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CR00")
  public Corpt00cOutputDto CR00 (@RequestBody Corpt00cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Corpt00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Corpt00cVariableContainer",
        CommareaMapper.mappingCorpt00cDfhcommarea(task.getCommarea("CR00")));
    corpt00c.run(appContext);
    return (Corpt00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CR00/forward")
  public Corpt00cOutputDto CR00Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Corpt00cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Corpt00cVariableContainer",
        CommareaMapper.mappingCorpt00cDfhcommarea(task.getCommarea("CR00")));
    corpt00c.run(appContext);
    return (Corpt00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CR00/noti")
  public void CR00Noti (@RequestBody Corpt00cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Corpt00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Corpt00cVariableContainer",
        CommareaMapper.mappingCorpt00cDfhcommarea(task.getCommarea("CR00")));
    corpt00c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Corpt00cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CT00")
  public Cotrn00cOutputDto CT00 (@RequestBody Cotrn00cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cotrn00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn00cVariableContainer",
        CommareaMapper.mappingCotrn00cDfhcommarea(task.getCommarea("CT00")));
    cotrn00c.run(appContext);
    return (Cotrn00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CT00/forward")
  public Cotrn00cOutputDto CT00Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cotrn00cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn00cVariableContainer",
        CommareaMapper.mappingCotrn00cDfhcommarea(task.getCommarea("CT00")));
    cotrn00c.run(appContext);
    return (Cotrn00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CT00/noti")
  public void CT00Noti (@RequestBody Cotrn00cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cotrn00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn00cVariableContainer",
        CommareaMapper.mappingCotrn00cDfhcommarea(task.getCommarea("CT00")));
    cotrn00c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cotrn00cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CT01")
  public Cotrn01cOutputDto CT01 (@RequestBody Cotrn01cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cotrn01cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn01cVariableContainer",
        CommareaMapper.mappingCotrn01cDfhcommarea(task.getCommarea("CT01")));
    cotrn01c.run(appContext);
    return (Cotrn01cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CT01/forward")
  public Cotrn01cOutputDto CT01Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cotrn01cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn01cVariableContainer",
        CommareaMapper.mappingCotrn01cDfhcommarea(task.getCommarea("CT01")));
    cotrn01c.run(appContext);
    return (Cotrn01cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CT01/noti")
  public void CT01Noti (@RequestBody Cotrn01cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cotrn01cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn01cVariableContainer",
        CommareaMapper.mappingCotrn01cDfhcommarea(task.getCommarea("CT01")));
    cotrn01c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cotrn01cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CT02")
  public Cotrn02cOutputDto CT02 (@RequestBody Cotrn02cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cotrn02cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn02cVariableContainer",
        CommareaMapper.mappingCotrn02cDfhcommarea(task.getCommarea("CT02")));
    cotrn02c.run(appContext);
    return (Cotrn02cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CT02/forward")
  public Cotrn02cOutputDto CT02Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cotrn02cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn02cVariableContainer",
        CommareaMapper.mappingCotrn02cDfhcommarea(task.getCommarea("CT02")));
    cotrn02c.run(appContext);
    return (Cotrn02cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CT02/noti")
  public void CT02Noti (@RequestBody Cotrn02cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cotrn02cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cotrn02cVariableContainer",
        CommareaMapper.mappingCotrn02cDfhcommarea(task.getCommarea("CT02")));
    cotrn02c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cotrn02cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CU00")
  public Cousr00cOutputDto CU00 (@RequestBody Cousr00cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cousr00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr00cVariableContainer",
        CommareaMapper.mappingCousr00cDfhcommarea(task.getCommarea("CU00")));
    cousr00c.run(appContext);
    return (Cousr00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CU00/forward")
  public Cousr00cOutputDto CU00Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cousr00cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr00cVariableContainer",
        CommareaMapper.mappingCousr00cDfhcommarea(task.getCommarea("CU00")));
    cousr00c.run(appContext);
    return (Cousr00cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CU00/noti")
  public void CU00Noti (@RequestBody Cousr00cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cousr00cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr00cVariableContainer",
        CommareaMapper.mappingCousr00cDfhcommarea(task.getCommarea("CU00")));
    cousr00c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cousr00cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CU01")
  public Cousr01cOutputDto CU01 (@RequestBody Cousr01cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cousr01cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr01cVariableContainer",
        CommareaMapper.mappingCousr01cDfhcommarea(task.getCommarea("CU01")));
    cousr01c.run(appContext);
    return (Cousr01cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CU01/forward")
  public Cousr01cOutputDto CU01Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cousr01cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr01cVariableContainer",
        CommareaMapper.mappingCousr01cDfhcommarea(task.getCommarea("CU01")));
    cousr01c.run(appContext);
    return (Cousr01cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CU01/noti")
  public void CU01Noti (@RequestBody Cousr01cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cousr01cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr01cVariableContainer",
        CommareaMapper.mappingCousr01cDfhcommarea(task.getCommarea("CU01")));
    cousr01c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cousr01cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CU02")
  public Cousr02cOutputDto CU02 (@RequestBody Cousr02cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cousr02cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr02cVariableContainer",
        CommareaMapper.mappingCousr02cDfhcommarea(task.getCommarea("CU02")));
    cousr02c.run(appContext);
    return (Cousr02cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CU02/forward")
  public Cousr02cOutputDto CU02Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cousr02cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr02cVariableContainer",
        CommareaMapper.mappingCousr02cDfhcommarea(task.getCommarea("CU02")));
    cousr02c.run(appContext);
    return (Cousr02cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CU02/noti")
  public void CU02Noti (@RequestBody Cousr02cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cousr02cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr02cVariableContainer",
        CommareaMapper.mappingCousr02cDfhcommarea(task.getCommarea("CU02")));
    cousr02c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cousr02cOutputDto)task.popOutputDto());
  }

  @PostMapping("/CU03")
  public Cousr03cOutputDto CU03 (@RequestBody Cousr03cInputDto inputDto,
                  HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cousr03cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr03cVariableContainer",
        CommareaMapper.mappingCousr03cDfhcommarea(task.getCommarea("CU03")));
    cousr03c.run(appContext);
    return (Cousr03cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CU03/forward")
  public Cousr03cOutputDto CU03Forward (HttpServletRequest request, HttpServletResponse response) {
    task.initialize(request, new Cousr03cOutputDto());
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr03cVariableContainer",
        CommareaMapper.mappingCousr03cDfhcommarea(task.getCommarea("CU03")));
    cousr03c.run(appContext);
    return (Cousr03cOutputDto)task.popOutputDto();
  }

  @PostMapping("/CU03/noti")
  public void CU03Noti (@RequestBody Cousr03cInputDto inputDto,
            HttpServletRequest request, HttpServletResponse response) {
    task.initialize(inputDto, new Cousr03cOutputDto(), request, response);
    Map< String, Object> appContext = new HashMap<>();
    appContext.put("Cousr03cVariableContainer",
        CommareaMapper.mappingCousr03cDfhcommarea(task.getCommarea("CU03")));
    cousr03c.run(appContext);
    screenLoader.saveScreenAndNoti(task.getInputDto().getSystemDto().getUserId(),
                                (Cousr03cOutputDto)task.popOutputDto());
  }

}