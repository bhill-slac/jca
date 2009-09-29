/**********************************************************************
 *
 *      Original Author: Eric Boucher
 *      Date:            05/05/2003
 *
 *      Experimental Physics and Industrial Control System (EPICS)
 *
 *      Copyright 1991, the University of Chicago Board of Governors.
 *
 *      This software was produced under  U.S. Government contract
 *      W-31-109-ENG-38 at Argonne National Laboratory.
 *
 *      Beamline Controls & Data Acquisition Group
 *      Experimental Facilities Division
 *      Advanced Photon Source
 *      Argonne National Laboratory
 *
 *
 * $Id: DBR_CTRL_String.java,v 1.1 2006-08-30 17:25:08 msekoranja Exp $
 *
 * Modification Log:
 * 01. 05/07/2003  erb  initial development
 *
 */

package gov.aps.jca.dbr;

// NOTE: this is actially DBR_STS_String (DBR_TIME_String because of CAS)
public class DBR_CTRL_String extends DBR_GR_String {
  static public final DBRType TYPE= new DBRType("DBR_CTRL_STRING", 28, DBR_CTRL_String.class);
  
  public DBR_CTRL_String() {

    this( 1 );

  }

  public DBR_CTRL_String( int count ) {
    this( new String[count] );
  }

  public DBR_CTRL_String( String[] value ) {
    super( value );
  }

  public DBRType getType() {
    return TYPE;
  }

}
