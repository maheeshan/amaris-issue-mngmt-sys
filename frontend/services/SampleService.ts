export default async function getSampleString() {
	return fetch("ai-issue-mngmt-backend:8080/sample/string", {
		method: "GET",
		headers: {
			"Content-Type": "application/json"
		},
		next: {
			revalidate: 0
		}
	}).then(response => response.json())
	.catch(error => error);
}