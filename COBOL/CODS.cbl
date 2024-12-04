       IDENTIFICATION DIVISION.                                                 
       PROGRAM-ID.    CODS.                                                 
       AUTHOR.        AWS.                                                      
                                                                                
       ENVIRONMENT DIVISION.                                                    
       INPUT-OUTPUT SECTION.                                                    
       FILE-CONTROL.                                                            
           SELECT CARDFILE-FILE ASSIGN TO   CARDFILE                            
                  ORGANIZATION IS INDEXED                                       
                  ACCESS MODE  IS RANDOM                                        
                  RECORD KEY   IS CARD-NUM.                                  

           SELECT TRANSACT-FILE ASSIGN TO TRANFILE                              
                  ORGANIZATION IS INDEXED                                       
                  ACCESS MODE  IS RANDOM                                        
                  RECORD KEY   IS TRAN-ID.                                  
                                                                                
           SELECT XREF-FILE ASSIGN TO   XREFFILE                                
                  ORGANIZATION IS INDEXED                                       
                  ACCESS MODE  IS RANDOM                                        
                  RECORD KEY   IS XREF-CARD-NUM.                             

           SELECT ACCTFILE-FILE ASSIGN TO ACCTFILE                              
                  ORGANIZATION IS INDEXED                                       
                  ACCESS MODE  IS RANDOM                                        
                  RECORD KEY   IS ACCT-ID.                                   

           SELECT CUSTFILE-FILE ASSIGN TO   CUSTFILE
                  ORGANIZATION IS INDEXED
                  ACCESS MODE  IS RANDOM                                        
                  RECORD KEY   IS CUST-ID.

           SELECT USRSEC-FILE ASSIGN TO   USRSEC   
                  ORGANIZATION IS INDEXED
                  ACCESS MODE  IS RANDOM                                        
                  RECORD KEY   IS SEC-USR-ID.

                                                                                
      *                                                                         
       DATA DIVISION.                                                           
       FILE SECTION.                                                            
       FD  CARDFILE-FILE.
       01  CARD-RECORD.
           05  CARD-NUM                          PIC X(16).
           05  CARD-ACCT-ID                      PIC 9(11).
           05  CARD-CVV-CD                       PIC 9(03).
           05  CARD-EMBOSSED-NAME                PIC X(50).
           05  CARD-EXPIRAION-DATE               PIC X(10).
           05  CARD-ACTIVE-STATUS                PIC X(01).
           05  FILLER                            PIC X(59).

       FD  TRANSACT-FILE.                                                       
       01  TRAN-RECORD.                                                         
           05  TRAN-ID                                 PIC X(16). 
           05  TRAN-TYPE-CD                            PIC X(02).               
           05  TRAN-CAT-CD                             PIC 9(04).               
           05  TRAN-SOURCE                             PIC X(10).               
           05  TRAN-DESC                               PIC X(100).              
           05  TRAN-AMT                                PIC S9(09)V99.           
           05  TRAN-MERCHANT-ID                        PIC 9(09).               
           05  TRAN-MERCHANT-NAME                      PIC X(50).               
           05  TRAN-MERCHANT-CITY                      PIC X(50).               
           05  TRAN-MERCHANT-ZIP                       PIC X(10).               
           05  TRAN-CARD-NUM                           PIC X(16).               
           05  TRAN-ORIG-TS                            PIC X(26).               
           05  TRAN-PROC-TS                            PIC X(26).               
           05  FILLER                                  PIC X(20).  
                                                                                
       FD XREF-FILE.                                                           
       01 CARD-XREF-RECORD.                                                     
           05  XREF-CARD-NUM                     PIC X(16).                     
           05  XREF-CUST-ID                      PIC 9(09).                     
           05  XREF-ACCT-ID                      PIC 9(11).                     
           05  FILLER                            PIC X(14). 

       FD  ACCTFILE-FILE.                                                        
       01  ACCOUNT-RECORD.
           05  ACCT-ID                           PIC 9(11).
           05  ACCT-ACTIVE-STATUS                PIC X(01).
           05  ACCT-CURR-BAL                     PIC S9(10)V99.
           05  ACCT-CREDIT-LIMIT                 PIC S9(10)V99.
           05  ACCT-CASH-CREDIT-LIMIT            PIC S9(10)V99.
           05  ACCT-OPEN-DATE                    PIC X(10).
           05  ACCT-EXPIRAION-DATE               PIC X(10). 
           05  ACCT-REISSUE-DATE                 PIC X(10).
           05  ACCT-CURR-CYC-CREDIT              PIC S9(10)V99.
           05  ACCT-CURR-CYC-DEBIT               PIC S9(10)V99.
           05  ACCT-ADDR-ZIP                     PIC X(10).
           05  ACCT-GROUP-ID                     PIC X(10).
           05  FILLER                            PIC X(178).
                                                                                
       FD  CUSTFILE-FILE.                                                        
       01  CUSTOMER-RECORD.
           05  CUST-ID                                 PIC 9(09).
           05  CUST-FIRST-NAME                         PIC X(25).
           05  CUST-MIDDLE-NAME                        PIC X(25).
           05  CUST-LAST-NAME                          PIC X(25).
           05  CUST-ADDR-LINE-1                        PIC X(50).
           05  CUST-ADDR-LINE-2                        PIC X(50).
           05  CUST-ADDR-LINE-3                        PIC X(50).		   
           05  CUST-ADDR-STATE-CD                      PIC X(02).
           05  CUST-ADDR-COUNTRY-CD                    PIC X(03).
           05  CUST-ADDR-ZIP                           PIC X(10).
           05  CUST-PHONE-NUM-1                        PIC X(15).
           05  CUST-PHONE-NUM-2                        PIC X(15).
           05  CUST-SSN                                PIC 9(09).
           05  CUST-GOVT-ISSUED-ID                     PIC X(20).
           05  CUST-DOB-YYYYMMDD                       PIC X(10).
           05  CUST-EFT-ACCOUNT-ID                     PIC X(10).
           05  CUST-PRI-CARD-HOLDER-IND                PIC X(01).
           05  CUST-FICO-CREDIT-SCORE                  PIC 9(03).
           05  FILLER                                  PIC X(168).      

       FD  USRSEC-FILE.                                                          
       01 SEC-USER-DATA.
           05 SEC-USR-ID                 PIC X(08).
           05 SEC-USR-FNAME              PIC X(20).
           05 SEC-USR-LNAME              PIC X(20).
           05 SEC-USR-PWD                PIC X(08).
           05 SEC-USR-TYPE               PIC X(01).
           05 SEC-USR-FILLER             PIC X(23).
                                                                                
      *****************************************************************         
       PROCEDURE DIVISION.                                                      
           DISPLAY 'DUMMY PROGRAM FOR DEFINE FD LAYOUT'.                    
