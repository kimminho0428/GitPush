       01      DFHBMSCA.                                                        
         02    DFHBMPEM  PICTURE X   VALUE  IS  X'19'.                          
         02    DFHBMPNL  PICTURE X   VALUE  IS  X'15'.                          
         02    DFHBMPFF  PICTURE X   VALUE  IS  X'0C'.                          
         02    DFHBMPCR  PICTURE X   VALUE  IS  X'0D'.                          
         02    DFHBMASK  PICTURE X   VALUE  IS  X'30'.                   '0'    
         02    DFHBMUNP  PICTURE X   VALUE  IS  X'20'.                   ' '    
         02    DFHBMUNN  PICTURE X   VALUE  IS  X'26'.                   '&'    
         02    DFHBMPRO  PICTURE X   VALUE  IS  X'2D'.                   '-'    
         02    DFHBMBRY  PICTURE X   VALUE  IS  X'48'.                   'H'    
         02    DFHBMDAR  PICTURE X   VALUE  IS  X'3C'.                   '<'    
         02    DFHBMFSE  PICTURE X   VALUE  IS  X'41'.                   'A'    
         02    DFHBMPRF  PICTURE X   VALUE  IS  X'2F'.                   '/'    
         02    DFHBMASF  PICTURE X   VALUE  IS  X'31'.                   '1'    
         02    DFHBMASB  PICTURE X   VALUE  IS  X'38'.                   '8'    
         02    DFHBMEOF  PICTURE X   VALUE  IS  X'80'.                          
         02    DFHBMCUR  PICTURE X   VALUE  IS  X'02'.                          
         02    DFHBMEC   PICTURE X   VALUE  IS  X'82'.                          
         02    DFHBMFLG  PICTURE X.                                             
             88    DFHERASE VALUES ARE X'80', X'82'.                            
             88    DFHCURSR VALUES ARE X'02', X'82'.                            
         02    DFHBMDET  PICTURE X   VALUE  IS  X'FF'.                          
         02    DFHBMPSO-BIN PIC 9(4) COMP VALUE 3599.                           
      * ABOVE VALUE 3599 = X'0E0F' ADDED BY PTM 81385 (APAR PN23267)            
         02    FILLER REDEFINES DFHBMPSO-BIN.                                   
           03  DFHBMPSO  PICTURE X.                                             
           03  DFHBMPSI  PICTURE X.                                             
         02    DFHSA     PICTURE X   VALUE  IS  X'28'.                          
         02    DFHCOLOR  PICTURE X   VALUE  IS  X'42'.                          
         02    DFHPS     PICTURE X   VALUE  IS  X'43'.                          
         02    DFHHLT    PICTURE X   VALUE  IS  X'41'.                          
         02    DFH3270   PICTURE X   VALUE  IS  X'C0'.                          
         02    DFHVAL    PICTURE X   VALUE  IS  X'C1'.                          
         02    DFHOUTLN  PICTURE X   VALUE  IS  X'C2'.                          
         02    DFHBKTRN  PICTURE X   VALUE  IS  X'46'.                          
         02    DFHALL    PICTURE X   VALUE  IS  X'00'.                          
         02    DFHERROR  PICTURE X   VALUE  IS  X'3F'.                          
         02    DFHDFT    PICTURE X   VALUE  IS  X'FF'.                          
         02    DFHDFCOL  PICTURE X   VALUE  IS  X'00'.                          
         02    DFHBLUE   PICTURE X   VALUE  IS  X'31'.                   '1'    
         02    DFHRED    PICTURE X   VALUE  IS  X'32'.                   '2'    
         02    DFHPINK   PICTURE X   VALUE  IS  X'33'.                   '3'    
         02    DFHGREEN  PICTURE X   VALUE  IS  X'34'.                   '4'    
         02    DFHTURQ   PICTURE X   VALUE  IS  X'35'.                   '5'    
         02    DFHYELLO  PICTURE X   VALUE  IS  X'36'.                   '6'    
         02    DFHNEUTR  PICTURE X   VALUE  IS  X'37'.                   '7'    
         02    DFHBASE   PICTURE X   VALUE  IS  X'00'.                          
         02    DFHDFHI   PICTURE X   VALUE  IS  X'00'.                          
         02    DFHBLINK  PICTURE X   VALUE  IS  X'31'.                   '1'    
         02    DFHREVRS  PICTURE X   VALUE  IS  X'32'.                   '2'    
         02    DFHUNDLN  PICTURE X   VALUE  IS  X'34'.                   '4'    
         02    DFHMFIL   PICTURE X   VALUE  IS  X'04'.                          
         02    DFHMENT   PICTURE X   VALUE  IS  X'02'.                          
         02    DFHMFE    PICTURE X   VALUE  IS  X'06'.                          
         02    DFHUNNOD  PICTURE X   VALUE  IS  X'28'.                   '('    
         02    DFHUNIMD  PICTURE X   VALUE  IS  X'49'.                   'I'    
         02    DFHUNNUM  PICTURE X   VALUE  IS  X'4A'.                   'J'    
         02    DFHUNNUB  PICTURE X   VALUE  IS  X'51'.                   'Q'    
      * ABOVE VALUE DFHUNNUB ADDED BY APAR PN67669                              
         02    DFHUNINT  PICTURE X   VALUE  IS  X'52'.                   'R'    
         02    DFHUNNON  PICTURE X   VALUE  IS  X'29'.                   ')'    
         02    DFHPROTI  PICTURE X   VALUE  IS  X'59'.                   'Y'    
         02    DFHPROTN  PICTURE X   VALUE  IS  X'25'.                   '%'    
         02    DFHMT     PICTURE X   VALUE  IS  X'01'.                          
         02    DFHMFT    PICTURE X   VALUE  IS  X'05'.                          
         02    DFHMET    PICTURE X   VALUE  IS  X'03'.                          
         02    DFHMFET   PICTURE X   VALUE  IS  X'07'.                          
         02    DFHDFFR   PICTURE X   VALUE  IS  X'00'.                          
         02    DFHLEFT   PICTURE X   VALUE  IS  X'08'.                          
         02    DFHOVER   PICTURE X   VALUE  IS  X'04'.                          
         02    DFHRIGHT  PICTURE X   VALUE  IS  X'02'.                          
         02    DFHUNDER  PICTURE X   VALUE  IS  X'01'.                          
         02    DFHBOX-BIN  PIC 9(4) COMP VALUE 15.                              
      * ABOVE VALUE 15 = X'000F' ADDED BY PTM 81385 (APAR PN23267)              
         02    FILLER REDEFINES DFHBOX-BIN.                                     
           03  FILLER    PICTURE X.                                             
           03  DFHBOX    PICTURE X.                                             
         02    DFHSOSI   PICTURE X   VALUE  IS  X'01'.                          
         02    DFHTRANS  PICTURE X   VALUE  IS  X'30'.                   '0'    
         02    DFHOPAQ   PICTURE X   VALUE  IS  X'FF'.                          
