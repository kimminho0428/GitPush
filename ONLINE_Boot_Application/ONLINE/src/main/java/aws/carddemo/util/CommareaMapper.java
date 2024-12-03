package aws.carddemo.util;

import aws.carddemo.variable.group.*;
import aws.carddemo.variable.CocrdupcVariableContainer;
import aws.carddemo.variable.Cousr01cVariableContainer;
import aws.carddemo.variable.Cotrn02cVariableContainer;
import aws.carddemo.variable.Coadm01cVariableContainer;
import aws.carddemo.variable.CsutldtcVariableContainer;
import aws.carddemo.variable.CoactvwcVariableContainer;
import aws.carddemo.variable.CocrdslcVariableContainer;
import aws.carddemo.variable.Cobil00cVariableContainer;
import aws.carddemo.variable.CocrdlicVariableContainer;
import aws.carddemo.variable.Cotrn01cVariableContainer;
import aws.carddemo.variable.Corpt00cVariableContainer;
import aws.carddemo.variable.Cousr02cVariableContainer;
import aws.carddemo.variable.Cotrn00cVariableContainer;
import aws.carddemo.variable.Cousr00cVariableContainer;
import aws.carddemo.variable.Comen01cVariableContainer;
import aws.carddemo.variable.Cousr03cVariableContainer;
import aws.carddemo.variable.Cosgn00cVariableContainer;
import aws.carddemo.variable.CoactupcVariableContainer;

public class CommareaMapper {

  public static CocrdupcVariableContainer mappingCocrdupcDfhcommarea(Object commarea) {
    CocrdupcVariableContainer cocrdupcVariableContainer = new CocrdupcVariableContainer();
    if (commarea instanceof CocrdupcDfhcommarea) {
      cocrdupcVariableContainer.setDfhcommarea(mappingGroupToCocrdupcDfhcommarea(commarea));
    } else {
      cocrdupcVariableContainer.getDfhcommarea().set(mappingSingleToCocrdupcDfhcommarea(commarea));
    }
    return cocrdupcVariableContainer;
  }

  public static CocrdupcDfhcommarea mappingGroupToCocrdupcDfhcommarea(Object commarea) {
    return (CocrdupcDfhcommarea) commarea;
  }

  public static String mappingSingleToCocrdupcDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cousr01cVariableContainer mappingCousr01cDfhcommarea(Object commarea) {
    Cousr01cVariableContainer cousr01cVariableContainer = new Cousr01cVariableContainer();
    if (commarea instanceof Cousr01cDfhcommarea) {
      cousr01cVariableContainer.setDfhcommarea(mappingGroupToCousr01cDfhcommarea(commarea));
    } else {
      cousr01cVariableContainer.getDfhcommarea().set(mappingSingleToCousr01cDfhcommarea(commarea));
    }
    return cousr01cVariableContainer;
  }

  public static Cousr01cDfhcommarea mappingGroupToCousr01cDfhcommarea(Object commarea) {
    return (Cousr01cDfhcommarea) commarea;
  }

  public static String mappingSingleToCousr01cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cotrn02cVariableContainer mappingCotrn02cDfhcommarea(Object commarea) {
    Cotrn02cVariableContainer cotrn02cVariableContainer = new Cotrn02cVariableContainer();
    if (commarea instanceof Cotrn02cDfhcommarea) {
      cotrn02cVariableContainer.setDfhcommarea(mappingGroupToCotrn02cDfhcommarea(commarea));
    } else {
      cotrn02cVariableContainer.getDfhcommarea().set(mappingSingleToCotrn02cDfhcommarea(commarea));
    }
    return cotrn02cVariableContainer;
  }

  public static Cotrn02cDfhcommarea mappingGroupToCotrn02cDfhcommarea(Object commarea) {
    return (Cotrn02cDfhcommarea) commarea;
  }

  public static String mappingSingleToCotrn02cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Coadm01cVariableContainer mappingCoadm01cDfhcommarea(Object commarea) {
    Coadm01cVariableContainer coadm01cVariableContainer = new Coadm01cVariableContainer();
    if (commarea instanceof Coadm01cDfhcommarea) {
      coadm01cVariableContainer.setDfhcommarea(mappingGroupToCoadm01cDfhcommarea(commarea));
    } else {
      coadm01cVariableContainer.getDfhcommarea().set(mappingSingleToCoadm01cDfhcommarea(commarea));
    }
    return coadm01cVariableContainer;
  }

  public static Coadm01cDfhcommarea mappingGroupToCoadm01cDfhcommarea(Object commarea) {
    return (Coadm01cDfhcommarea) commarea;
  }

  public static String mappingSingleToCoadm01cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }


  public static CoactvwcVariableContainer mappingCoactvwcDfhcommarea(Object commarea) {
    CoactvwcVariableContainer coactvwcVariableContainer = new CoactvwcVariableContainer();
    if (commarea instanceof CoactvwcDfhcommarea) {
      coactvwcVariableContainer.setDfhcommarea(mappingGroupToCoactvwcDfhcommarea(commarea));
    } else {
      coactvwcVariableContainer.getDfhcommarea().set(mappingSingleToCoactvwcDfhcommarea(commarea));
    }
    return coactvwcVariableContainer;
  }

  public static CoactvwcDfhcommarea mappingGroupToCoactvwcDfhcommarea(Object commarea) {
    return (CoactvwcDfhcommarea) commarea;
  }

  public static String mappingSingleToCoactvwcDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static CocrdslcVariableContainer mappingCocrdslcDfhcommarea(Object commarea) {
    CocrdslcVariableContainer cocrdslcVariableContainer = new CocrdslcVariableContainer();
    if (commarea instanceof CocrdslcDfhcommarea) {
      cocrdslcVariableContainer.setDfhcommarea(mappingGroupToCocrdslcDfhcommarea(commarea));
    } else {
      cocrdslcVariableContainer.getDfhcommarea().set(mappingSingleToCocrdslcDfhcommarea(commarea));
    }
    return cocrdslcVariableContainer;
  }

  public static CocrdslcDfhcommarea mappingGroupToCocrdslcDfhcommarea(Object commarea) {
    return (CocrdslcDfhcommarea) commarea;
  }

  public static String mappingSingleToCocrdslcDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cobil00cVariableContainer mappingCobil00cDfhcommarea(Object commarea) {
    Cobil00cVariableContainer cobil00cVariableContainer = new Cobil00cVariableContainer();
    if (commarea instanceof Cobil00cDfhcommarea) {
      cobil00cVariableContainer.setDfhcommarea(mappingGroupToCobil00cDfhcommarea(commarea));
    } else {
      cobil00cVariableContainer.getDfhcommarea().set(mappingSingleToCobil00cDfhcommarea(commarea));
    }
    return cobil00cVariableContainer;
  }

  public static Cobil00cDfhcommarea mappingGroupToCobil00cDfhcommarea(Object commarea) {
    return (Cobil00cDfhcommarea) commarea;
  }

  public static String mappingSingleToCobil00cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static CocrdlicVariableContainer mappingCocrdlicDfhcommarea(Object commarea) {
    CocrdlicVariableContainer cocrdlicVariableContainer = new CocrdlicVariableContainer();
    if (commarea instanceof CocrdlicDfhcommarea) {
      cocrdlicVariableContainer.setDfhcommarea(mappingGroupToCocrdlicDfhcommarea(commarea));
    } else {
      cocrdlicVariableContainer.getDfhcommarea().set(mappingSingleToCocrdlicDfhcommarea(commarea));
    }
    return cocrdlicVariableContainer;
  }

  public static CocrdlicDfhcommarea mappingGroupToCocrdlicDfhcommarea(Object commarea) {
    return (CocrdlicDfhcommarea) commarea;
  }

  public static String mappingSingleToCocrdlicDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cotrn01cVariableContainer mappingCotrn01cDfhcommarea(Object commarea) {
    Cotrn01cVariableContainer cotrn01cVariableContainer = new Cotrn01cVariableContainer();
    if (commarea instanceof Cotrn01cDfhcommarea) {
      cotrn01cVariableContainer.setDfhcommarea(mappingGroupToCotrn01cDfhcommarea(commarea));
    } else {
      cotrn01cVariableContainer.getDfhcommarea().set(mappingSingleToCotrn01cDfhcommarea(commarea));
    }
    return cotrn01cVariableContainer;
  }

  public static Cotrn01cDfhcommarea mappingGroupToCotrn01cDfhcommarea(Object commarea) {
    return (Cotrn01cDfhcommarea) commarea;
  }

  public static String mappingSingleToCotrn01cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Corpt00cVariableContainer mappingCorpt00cDfhcommarea(Object commarea) {
    Corpt00cVariableContainer corpt00cVariableContainer = new Corpt00cVariableContainer();
    if (commarea instanceof Corpt00cDfhcommarea) {
      corpt00cVariableContainer.setDfhcommarea(mappingGroupToCorpt00cDfhcommarea(commarea));
    } else {
      corpt00cVariableContainer.getDfhcommarea().set(mappingSingleToCorpt00cDfhcommarea(commarea));
    }
    return corpt00cVariableContainer;
  }

  public static Corpt00cDfhcommarea mappingGroupToCorpt00cDfhcommarea(Object commarea) {
    return (Corpt00cDfhcommarea) commarea;
  }

  public static String mappingSingleToCorpt00cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cousr02cVariableContainer mappingCousr02cDfhcommarea(Object commarea) {
    Cousr02cVariableContainer cousr02cVariableContainer = new Cousr02cVariableContainer();
    if (commarea instanceof Cousr02cDfhcommarea) {
      cousr02cVariableContainer.setDfhcommarea(mappingGroupToCousr02cDfhcommarea(commarea));
    } else {
      cousr02cVariableContainer.getDfhcommarea().set(mappingSingleToCousr02cDfhcommarea(commarea));
    }
    return cousr02cVariableContainer;
  }

  public static Cousr02cDfhcommarea mappingGroupToCousr02cDfhcommarea(Object commarea) {
    return (Cousr02cDfhcommarea) commarea;
  }

  public static String mappingSingleToCousr02cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cotrn00cVariableContainer mappingCotrn00cDfhcommarea(Object commarea) {
    Cotrn00cVariableContainer cotrn00cVariableContainer = new Cotrn00cVariableContainer();
    if (commarea instanceof Cotrn00cDfhcommarea) {
      cotrn00cVariableContainer.setDfhcommarea(mappingGroupToCotrn00cDfhcommarea(commarea));
    } else {
      cotrn00cVariableContainer.getDfhcommarea().set(mappingSingleToCotrn00cDfhcommarea(commarea));
    }
    return cotrn00cVariableContainer;
  }

  public static Cotrn00cDfhcommarea mappingGroupToCotrn00cDfhcommarea(Object commarea) {
    return (Cotrn00cDfhcommarea) commarea;
  }

  public static String mappingSingleToCotrn00cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cousr00cVariableContainer mappingCousr00cDfhcommarea(Object commarea) {
    Cousr00cVariableContainer cousr00cVariableContainer = new Cousr00cVariableContainer();
    if (commarea instanceof Cousr00cDfhcommarea) {
      cousr00cVariableContainer.setDfhcommarea(mappingGroupToCousr00cDfhcommarea(commarea));
    } else {
      cousr00cVariableContainer.getDfhcommarea().set(mappingSingleToCousr00cDfhcommarea(commarea));
    }
    return cousr00cVariableContainer;
  }

  public static Cousr00cDfhcommarea mappingGroupToCousr00cDfhcommarea(Object commarea) {
    return (Cousr00cDfhcommarea) commarea;
  }

  public static String mappingSingleToCousr00cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Comen01cVariableContainer mappingComen01cDfhcommarea(Object commarea) {
    Comen01cVariableContainer comen01cVariableContainer = new Comen01cVariableContainer();
    if (commarea instanceof Comen01cDfhcommarea) {
      comen01cVariableContainer.setDfhcommarea(mappingGroupToComen01cDfhcommarea(commarea));
    } else {
      comen01cVariableContainer.getDfhcommarea().set(mappingSingleToComen01cDfhcommarea(commarea));
    }
    return comen01cVariableContainer;
  }

  public static Comen01cDfhcommarea mappingGroupToComen01cDfhcommarea(Object commarea) {
    return (Comen01cDfhcommarea) commarea;
  }

  public static String mappingSingleToComen01cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cousr03cVariableContainer mappingCousr03cDfhcommarea(Object commarea) {
    Cousr03cVariableContainer cousr03cVariableContainer = new Cousr03cVariableContainer();
    if (commarea instanceof Cousr03cDfhcommarea) {
      cousr03cVariableContainer.setDfhcommarea(mappingGroupToCousr03cDfhcommarea(commarea));
    } else {
      cousr03cVariableContainer.getDfhcommarea().set(mappingSingleToCousr03cDfhcommarea(commarea));
    }
    return cousr03cVariableContainer;
  }

  public static Cousr03cDfhcommarea mappingGroupToCousr03cDfhcommarea(Object commarea) {
    return (Cousr03cDfhcommarea) commarea;
  }

  public static String mappingSingleToCousr03cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static Cosgn00cVariableContainer mappingCosgn00cDfhcommarea(Object commarea) {
    Cosgn00cVariableContainer cosgn00cVariableContainer = new Cosgn00cVariableContainer();
    if (commarea instanceof Cosgn00cDfhcommarea) {
      cosgn00cVariableContainer.setDfhcommarea(mappingGroupToCosgn00cDfhcommarea(commarea));
    } else {
      cosgn00cVariableContainer.getDfhcommarea().set(mappingSingleToCosgn00cDfhcommarea(commarea));
    }
    return cosgn00cVariableContainer;
  }

  public static Cosgn00cDfhcommarea mappingGroupToCosgn00cDfhcommarea(Object commarea) {
    return (Cosgn00cDfhcommarea) commarea;
  }

  public static String mappingSingleToCosgn00cDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

  public static CoactupcVariableContainer mappingCoactupcDfhcommarea(Object commarea) {
    CoactupcVariableContainer coactupcVariableContainer = new CoactupcVariableContainer();
    if (commarea instanceof CoactupcDfhcommarea) {
      coactupcVariableContainer.setDfhcommarea(mappingGroupToCoactupcDfhcommarea(commarea));
    } else {
      coactupcVariableContainer.getDfhcommarea().set(mappingSingleToCoactupcDfhcommarea(commarea));
    }
    return coactupcVariableContainer;
  }

  public static CoactupcDfhcommarea mappingGroupToCoactupcDfhcommarea(Object commarea) {
    return (CoactupcDfhcommarea) commarea;
  }

  public static String mappingSingleToCoactupcDfhcommarea(Object commarea) {
    return String.valueOf(commarea);
  }

}