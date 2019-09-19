function showForm() {
	var v = document.getElementById("opt").value;
	if (v == 'NO') {
		document.getElementById("monyr").value = 'No Comment';
		document.getElementById("ol").value = 'No Comment';
		document.getElementById("hosname").value = 'No Comment';
	}
}
function showChange() {
	var hp1 = document.getElementById("bp").value;
	var ha1 = document.getElementById("ha").value;
	var cl1 = document.getElementById("cl").value;
	var db1 = document.getElementById("db").value;
	var hd1 = document.getElementById("hd").value;
	var th1 = document.getElementById("th").value;
	if (hp1 == 'NO') {
		document.getElementById("hc").value = 'No Comment';
	}
	if (ha1 == 'NO') {
		document.getElementById("hac").value = 'No Comment';
	}
	if (cl1 == 'NO') {
		document.getElementById("clc").value = 'No Comment';
	}
	if (db1 == 'NO') {
		document.getElementById("dbc").value = 'No Comment';
	}
	if (hd1 == 'NO') {
		document.getElementById("hdc").value = 'No Comment';
	}
	if (th1 == 'NO') {
		document.getElementById("tc").value = 'No Comment';
	}

}
function showChangeSecond() {
	var med1 = document.getElementById("med").value;
	var fd1 = document.getElementById("fd").value;
	var la1 = document.getElementById("la").value;
	var ot1 = document.getElementById("ot").value;

	var ds1 = document.getElementById("ds").value;
	var des1 = document.getElementById("des").value;
	var dl1 = document.getElementById("dl").value;
	var dd1 = document.getElementById("dd").value;

	if (med1 == 'NO') {
		document.getElementById("medc").value = 'No Comment';
	}
	if (fd1 == 'NO') {
		document.getElementById("fdc").value = 'No Comment';
	}
	if (la1 == 'NO') {
		document.getElementById("lac").value = 'No Comment';
	}
	if (ot1 == 'NO') {
		document.getElementById("otc").value = 'No Comment';
	}
	if (ds1 == 'NO') {
		document.getElementById("dsc").value = 'No Comment';
	}
	if (des1 == 'NO') {
		document.getElementById("desc").value = 'No Comment';
	}
	if (dl1 == 'NO') {
		document.getElementById("dlc").value = 'No Comment';
	}
	if (dd1 == 'NO') {
		document.getElementById("ddc").value = 'No Comment';
	}

}
