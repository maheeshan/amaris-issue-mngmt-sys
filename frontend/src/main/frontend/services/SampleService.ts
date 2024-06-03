export default async function getSampleString() {
	return fetch("http://localhost:8080/sample/string", {
		method: "GET",
		headers: {
			"Content-Type": "application/json"
		}
	}).then(response => response.json())
	.catch(error => error);
}