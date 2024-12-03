import * as React from 'react';
import image from '../logo/CI_TmaxSoft.png';

const LogoContainer = ({history}) => {

    return (
        <div style={{height: 60, width: '100%'}}>
            <h1>
                <center>
                    <img src={image}  height={50} onClick={()=> {
                        console.log("hello image");
                        history.replace({
                            pathname: '/',
                            state: {
                                termId : '태훈',
                                startCode : 'TD',
                                path : '/'
                            }
                        });
                    }}/>
                </center>
            </h1>
        </div>
    );
};

export default LogoContainer;