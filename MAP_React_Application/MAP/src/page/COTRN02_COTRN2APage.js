import * as React from 'react';
import HeaderContainer from "../runtime/component/header/HeaderContainer";
import BarContainer from "../runtime/component/bar/BarContainer";
import COTRN02_COTRN2A from "../components/COTRN02_COTRN2A";
import FooterContainer from "../runtime/component/footer/FooterContainer";


const COTRN02_COTRN2APage = ({history, location}) => {
  return (
    <div>
      <HeaderContainer history={history}  location = {location}/>
        <center><COTRN02_COTRN2A history={history} location = {location}/></center>
        <center><FooterContainer history={history}/></center>
    </div>
  );
};

export default COTRN02_COTRN2APage;