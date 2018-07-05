$(document).ready(function () {
    $('#getCtypes').click(function () {
        $.ajax({
            url: "/export/api/ctypes",
            type: 'GET',
            success: function (data) {
                $('#ec-result').text(data);
            },
            error: function (xhr, status, error) {
                console.log("error");
            }
        });
    });
});