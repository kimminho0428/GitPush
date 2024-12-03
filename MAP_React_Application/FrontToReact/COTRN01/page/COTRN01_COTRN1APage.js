import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COTRN01_COTRN1A from "../components/COTRN01_COTRN1A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COTRN01_COTRN1APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COTRN01_COTRN1A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COTRN01_COTRN1APage;