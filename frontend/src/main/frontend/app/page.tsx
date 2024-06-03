import getSampleString from "@/services/SampleService";
import Image from "next/image";

export default async function Home() {

  const response = await getSampleString();
  console.log(response);

  return (
    <main className="flex min-h-screen flex-col items-center justify-between p-24">
    	Hello - {response?.data || response?.error || "response"}
    </main>
  );
}
