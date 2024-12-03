import * as React from 'react';
import config from '../../../config/config.json';
import Box from "@mui/material/Box";
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import {Autocomplete} from "@mui/material";
import TextField from '@mui/material/TextField';

const LanguageView = ({}) => {
    const [language, setLanguage] = React.useState('');

    return (
        <Box sx={{marginTop:"2.5rem", display: "flex", flexDirection: "column"}}>
            Language
            <FormControl >
                <Select
                    id = "languageBox"
                    value={language}
                    sx = {{ width: 400 }}
                    displayEmpty
                    disabled={true}
                >
                    <MenuItem value="">
                        <em>English(United States)</em>
                    </MenuItem>
                </Select>
            </FormControl>

        </Box>

    );
};

export default LanguageView;
