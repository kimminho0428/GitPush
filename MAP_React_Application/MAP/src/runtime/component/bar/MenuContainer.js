import * as React from 'react';
import Box from '@mui/material/Box';
import BottomNavigation from '@mui/material/BottomNavigation';
import BottomNavigationAction from '@mui/material/BottomNavigationAction';
import axios from "axios";
import {makeContentJson, makeJson} from "../../JsonFactory";
import {convertPressedKey} from "../../KeyEvent";
import {Badge, makeStyles, Modal, Typography} from "@material-ui/core";
import image from "../logo/CI_TmaxSoft.png";
import NotificationsActiveTwoToneIcon from "@material-ui/icons/NotificationsActiveTwoTone";
import SettingsOutlinedIcon from '@mui/icons-material/SettingsOutlined';
import PersonOutlineOutlinedIcon from '@mui/icons-material/PersonOutlineOutlined';
import LogoutOutlinedIcon from '@mui/icons-material/LogoutOutlined';
import useStore from "../../../store/UseStore";
import Stack from "@mui/material/Stack";
import Divider from "@mui/material/Divider";
import {Alert} from "@mui/material";
import AlertTitle from "@mui/material/AlertTitle";
import {useEffect} from "react";
import Paper from "@mui/material/Paper";
import MenuList from "@mui/material/MenuList";
import MenuItem from "@mui/material/MenuItem";
import {Link} from "react-router-dom";
import ListItemText from "@mui/material/ListItemText";
import DeleteIcon from '@mui/icons-material/Delete';
import Button from '@mui/material/Button';

const MenuContainer = ({history, location}) => {

    const [value, setValue] = React.useState(0);
    const [settingValue, setSettingValue] = React.useState(0);

    const {SystemStore} = useStore();
    const [alarmNoti, setAlarmNoti] = React.useState(SystemStore.alarmContent);
    const [alarmCount, setAlarmCount] = React.useState(SystemStore.alarmContent.length);

    const [open, setOpen] = React.useState(false);
    const handleOpen = () => setOpen(true);
    const handleClose = () => setOpen(false);

    const systemDto = location.state.response.systemDto;

    useEffect (() => {
        if(systemDto.notification !== null && systemDto.notification !== '') {
            const content = makeContentJson(alarmCount + 1, 'info', "SEND TEXT MESSAGE arrives", systemDto.notification);

            let _value = SystemStore.alarmContent;
            _value.push(content);

            setAlarmNoti(_value);
            setAlarmCount(alarmCount + 1);
        }
    }, [systemDto]);

    const eventClickHandler = (newValue) => {
        setSettingValue(newValue);
        handleOpen();
    }

    const event = (value, id) => {
        SystemStore.setAlarmContent(value.filter((object) => object.id !== id));
        SystemStore.setAlarmCount(alarmCount > 0 ? alarmCount - 1 : alarmCount);
        setAlarmNoti(value.filter((object) => object.id !== id));
        setAlarmCount(alarmCount > 0 ? alarmCount - 1 : alarmCount);
    }

    const clearAllEvent = () => {
        SystemStore.setAlarmContent([]);
        SystemStore.setAlarmCount(0);
        setAlarmNoti([]);
        setAlarmCount(0);
    }

    const request = (url) => {
        const inputData = makeJson("taehoon", convertPressedKey(13));
        axios.post(url, inputData, {withCredentials: true}).then(response => {
            console.log("response start page : " + JSON.stringify(response));
            const responseDto = response.data;
            console.log("[start page] response  : " + JSON.stringify(responseDto));
            if (responseDto != null) {
                if (responseDto.pageName != null) {
                    history.replace({
                        pathname: '/' + responseDto.pageName,
                        state: {
                            response: response.data,
                            url: "/api/v2/OF21/",
                            termId: '태훈',
                            startCode: 'TD',
                            path: '/' + responseDto.pageName
                        }
                    });
                }
            }
        }).catch((error) => {
            console.log("error : " + JSON.stringify(error));
            const errorReasons = error.response.data.exception.name.split('.');
            const errorReason = errorReasons[errorReasons.length - 1];
            const errorMsg = error.message;
        });
    }

    return (
        <div style={{display: "flex", justifyContent: "left", alignItems: "center"}}>
            <img src={image} height={28} style={{marginLeft: "2.5rem"}} onClick={() => {
                console.log("hello image");
                history.replace({
                    pathname: '/',
                    state: {
                        termId: '태훈',
                        startCode: 'TD',
                        path: '/'
                    }
                });
            }}/>
            <Box sx={{
                height: "20", width: 1000, flex: 0.9, "& .MuiBottomNavigationAction-root, .Mui-selected, svg": {
                    color: "white", fontSize: "16px"
                }
            }}>
                <BottomNavigation
                    style={{height: "20", backgroundColor: "#000040"}}
                    showLabels
                    value={value}
                    onChange={(event, newValue) => {
                        setValue(newValue);
                    }}
                >
                    <BottomNavigationAction label="Solution" onClick={() => request("/api/v2/OF21/OIVP")}/>
                    <BottomNavigationAction label="Service" onClick={() => request("/api/v2/OF21/OIBR")}/>
                    <BottomNavigationAction label="About us" onClick={() => request("/api/v2/OF21/OIIQ")}/>
                    <BottomNavigationAction label="Business" onClick={() => request("/api/v2/OF21/OIIS")}/>
                    <BottomNavigationAction label="Promotion" onClick={() => request("/api/v2/OF21/OIUP")}/>
                    <BottomNavigationAction label="Contact Us" onClick={() => request("/api/v2/OF21/OIDE")}/>
                </BottomNavigation>
            </Box>

            <Box sx={{
                height: "20", flex: 0.1, "& .MuiBottomNavigationAction-root, .Mui-selected, svg": {
                    color: "white", fontSize: "16px"
                }
            }}>
                <BottomNavigation
                    style={{height: "20", backgroundColor: "#000040"}}
                    showLabels
                    settingValue={settingValue}
                    onChange={(event, newValue) => {
                        eventClickHandler(newValue);
                    }}
                >
                    <BottomNavigationAction icon=<Badge color="secondary" badgeContent={alarmCount} max={9}>
                        <NotificationsActiveTwoToneIcon style={{
                            fontSize: "1.8rem",
                            color: "white"
                        }}/>
                    </Badge> />
                    <BottomNavigationAction icon=<PersonOutlineOutlinedIcon style={{
                        fontSize: "1.8rem",
                        color: "white"
                    }}/> onClick={() => request("/api/v2/OF21/OIDE")}/>
                    <BottomNavigationAction icon=<SettingsOutlinedIcon style={{
                        fontSize: "1.8rem",
                        color: "white"
                    }}/> onClick={() => request("/api/v2/OF21/OIDE")}/>
                    <BottomNavigationAction icon=<LogoutOutlinedIcon style={{
                        fontSize: "1.8rem",
                        color: "white"
                    }}/> onClick={() => {
                    history.replace({
                        pathname: '/',
                        state: {
                            termId: '태훈',
                            startCode: 'TD',
                            path: '/'
                        }
                    });
                }}
                    />
                    }
                </BottomNavigation>
            </Box>

            {settingValue == 0 &&
            <div>
                <Modal
                    open={open}
                    onClose={handleClose}
                    aria-labelledby="modal-modal-title"
                    aria-describedby="modal-modal-description"
                    style ={{
                        marginTop:"4rem",
                        display: "flex",
                        alignItems: "start",
                        justifyContent: "flex-end"
                    }}
                >
                    <Box sx={notificationStyle}>
                        <Box sx={{display:"flex", flexDirection:"column", width:"100%"}}>
                            <Box sx={{display:"flex", flexDirection:"column", alignItems:"start"}}>
                                <Typography id="modal-modal-title" variant="h5" component="h2">
                                    NOTIFICATION
                                </Typography>
                            </Box>
                            <Box style={{display:"flex", justifyContent:"flex-end", alignItems:"center"}}>
                                <Button variant="outlined" style={{display:"flex", justifyContent:"flex-end", alignItems:"center"}}
                                        startIcon={<DeleteIcon />} onClick={clearAllEvent}>
                                    Clear All
                                </Button>
                            </Box>
                        </Box>
                        <br />

                        <Stack direction="column" divider={<Divider orientation="horizontal" flexItem />}
                               spacing={2}>
                            {
                                alarmNoti.slice(0).reverse().map((noti, index) => (
                                    <Alert severity={noti.severity} onClose={() => {
                                        event(alarmNoti, noti.id);
                                    }}>
                                        <AlertTitle>{noti.title}</AlertTitle>
                                        {noti.content}
                                    </Alert>
                                ))
                            }
                        </Stack>
                    </Box>
                </Modal>
            </div>
            }

            {settingValue == 1 &&
            <div>
                <Modal
                    open={open}
                    onClose={handleClose}
                    aria-labelledby="modal-modal-title"
                    aria-describedby="modal-modal-description"
                    style ={{
                        marginTop:"4rem",
                        display: "flex",
                        alignItems: "start",
                        justifyContent: "flex-end"
                    }}
                >
                    <Paper sx={userSettingStyle}>
                        <Typography id="modal-modal-title" variant="h6" component="h2">
                            계정
                        </Typography>
                        <br/>
                        <MenuList dense>
                            <MenuItem component ={Link} to='/account/management'>
                                <ListItemText>계정 관리</ListItemText>
                            </MenuItem>
                            <Divider style={{display:"flex", width:200}} />
                            <MenuItem component ={Link} to='/account/profile'>
                                <ListItemText>프로필</ListItemText>
                            </MenuItem>
                            <MenuItem component ={Link} to='/account/personal-setting'>
                                <ListItemText>개인 설정</ListItemText>
                            </MenuItem>
                            <MenuItem component ={Link} to='/account/auth'>
                                <ListItemText>인증/인가</ListItemText>
                            </MenuItem>
                        </MenuList>

                    </Paper>
                </Modal>
            </div>
            }

            {settingValue == 2 &&
            <div>
                <Modal
                    open={open}
                    onClose={handleClose}
                    aria-labelledby="modal-modal-title"
                    aria-describedby="modal-modal-description"
                    style ={{
                        marginTop:"4rem",
                        display: "flex",
                        alignItems: "start",
                        justifyContent: "flex-end"
                    }}
                >
                    <Box sx={settingStyle}>
                        <Typography id="modal-modal-title" variant="h6" component="h2">
                            설정
                        </Typography>
                        <br />
                        <MenuList dense>
                            환경
                            <MenuItem component ={Link} to='/setting/environment'>
                                <ListItemText>시스템 설정</ListItemText>
                            </MenuItem>
                            <Divider style={{display:"flex", width:200}} />
                            기타
                            <MenuItem component ={Link} to='/setting/alarm'>
                                <ListItemText>알림 설정</ListItemText>
                            </MenuItem>
                            <MenuItem component ={Link} to='/setting/monitoring'>
                                <ListItemText>모니터링</ListItemText>
                            </MenuItem>
                        </MenuList>
                    </Box>
                </Modal>
            </div>
            }

        </div>
    );
};

const notificationStyle = {

    display: "flex",
    alignItems: "start",
    justifyContent: "flex-start",
    flexDirection: "column",
    width: 400,
    height: 600,
    bgcolor: 'background.paper',
    border: '2px solid #000',
    boxShadow: 10,
    overflowY:'scroll',
    p: 4,
};

const userSettingStyle = {

    display: "flex",
    alignItems: "start",
    justifyContent: "flex-start",
    flexDirection: "column",
    width: 200,
    height: 200,
    bgcolor: 'background.paper',
    border: '2px solid #000',
    boxShadow: 10,
    p: 4,
};

const settingStyle = {

    display: "flex",
    alignItems: "start",
    justifyContent: "flex-start",
    flexDirection: "column",
    width: 200,
    height: 200,
    bgcolor: 'background.paper',
    border: '2px solid #000',
    boxShadow: 10,
    p: 4,
};

export default MenuContainer;