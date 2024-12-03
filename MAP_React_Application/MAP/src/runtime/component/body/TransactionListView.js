import * as React from 'react';
import config from '../../../config/config.json';
import Box from "@mui/material/Box";
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import {Autocomplete} from "@mui/material";
import TextField from '@mui/material/TextField';
const TransactionListView = ({simpleHandler, handler, transaction, inputValue}) => {

    const transList = config.ENTRY_TRANSACTION;
    let transactionNames = transList.map((tx) => { return {
        label : tx.name + (tx.desc !== null && tx.desc !== "" ? " [" + tx.desc + "]" : ""),
        value : tx.name
    }});

    return (
        <Box sx={{m: 1, minWidth: 550, marginRight: "0.5rem"}}>
            <Autocomplete
                disablePortal
                id = "combo-box-demo"
                sx = {{ width: 550 }}
                options = {transactionNames}
                value={transaction}
                onChange={(event, newValue) => {
                    if(newValue === null) {
                        newValue = "";
                        handler(newValue);
                        return;
                    }
                    handler(newValue.value)}
                }
                inputValue={inputValue}
                onInputChange={(event, newInputValue) => {
                    handler(newInputValue);
                }}
                isOptionEqualToValue={(option, value) => option.value === value}
                renderInput =
                    {(params) =>
                        <TextField {...params} label = "Transaction" />
                    }
            />
        </Box>

    );
};

export default TransactionListView;
