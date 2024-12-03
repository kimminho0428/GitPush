import * as React from 'react';
import config from '../../../config/config.json';
import Box from "@mui/material/Box";
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import {Autocomplete} from "@mui/material";
import TextField from '@mui/material/TextField';

const TimeZoneView = ({}) => {
    const [timeZone, setTimeZone] = React.useState('');

    return (
        <Box sx={{marginTop:"2.5rem", display: "flex", flexDirection: "column"}}>
            Your timezone
            <FormControl >
                <Select
                id = "timeZoneViewBox"
                value={timeZone}
                sx = {{ width: 400 }}
                displayEmpty
                disabled={true}
                >
                    <MenuItem value="">
                        <em>Asia/Seoul</em>
                    </MenuItem>
                </Select>
            </FormControl>

        </Box>

    );
};

export default TimeZoneView;
