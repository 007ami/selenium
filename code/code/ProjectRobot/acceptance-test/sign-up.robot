*** Settings ***
Resource          ../resource/imports.txt
Resource          ../resource/environment-variables.txt
Resource          ../resource/object-variables.txt
Library           CSVLibrary

*** Test Cases ***
FNC_001
    OpenBrowser    ${base_url}    firefox
    Input Text    ${fullname_txt}    xxx yyy
    Input Text    ${uname_txt}    aaabbb
    Input Text    ${email_txt}    pachauryamit009@gmail.com
    Input Text    ${pword_txt}    Amit@321
    Input Text    ${pwordconf_txt}    Amit@321
    Click Button    ${createAcc_btn}

FNC_002
    Check for validation1

*** Keywords ***
Check for validation
    ${file_text}    Get File    ${CURDIR}/testfile.csv
    Log    ${file_text}
    ${file_text}    Split To Lines    ${file_text}    1
    Log    ${file_text}
    ${new_file}    Remove Duplicates    ${file_text}
    Log    ${new_file}
    FOR    ${new_file_item}    IN    @{new_file}
    Log    ${new_file_item}
    @{coloum}    Split String    ${new_file_item}    ,
    Run Keyword And Continue On Failure    ${new_file_item}=

Check for validation1
    ${data_dict}    Create Dictionary
    ${files_data_list}    Get File    ${CURDIR}/testfile.csv
    ${files_data_list}    Split To Lines    ${files_data_list}    1
    ${files_data_list}    Remove Duplicates    ${files_data_list}
    FOR    ${files_data_list_items}    IN    @{files_data_list}
        ${files_data_list_items}    Split String    ${files_data_list_items}    ,
        Set Test Variable    ${id_data}    ${files_data_list_items[0]}
        Set Test Variable    ${text_data}    ${files_data_list_items[1]}
        Set Test Variable    ${value_data}    ${files_data_list_items[2]}
        Run Keyword If    "${id_data}"!="${EMPTY}"    Set To Dictionary    ${data_dict}    ID    ${id_data}
        ...    ELSE    Log    Empty ID
        Run Keyword If    "${text_data}"!="${EMPTY}"    Set To Dictionary    ${data_dict}    TEXT    ${text_data}
        ...    ELSE    Log    Empty TEXT
        Run Keyword If    "${value_data}"!="${EMPTY}"    Set To Dictionary    ${data_dict}    Value    ${value_data}
        ...    ELSE    Log    Empty Value
        Run Keyword And Continue On Failure    Dictionary Should Contain Key    ${data_dict}    ID
        Run Keyword And Continue On Failure    Dictionary Should Contain Key    ${data_dict}    TEXT
        Run Keyword And Continue On Failure    Dictionary Should Contain Key    ${data_dict}    Value
        Log    ${data_dict}
        END

Check for empty
    Run Keyword And Continue On Failure    Should Not Be Empty    ${files_data_list_item[0]}    Not Empty
    Run Keyword And Continue On Failure    Should Not Be Empty    ${files_data_list_item[1]}    Not Empty
    Run Keyword And Continue On Failure    Should Not Be Empty    ${files_data_list_item[2]}    Not Empty

Check for datatype
    Run Keyword And Continue On Failure    Should Be String    ${files_data_list_item[0]}    String Value
    Run Keyword And Continue On Failure    Should Be String    ${files_data_list_item[1]}    String Value
    Run Keyword And Continue On Failure    Should Be String    ${files_data_list_item[2]}    String Value
